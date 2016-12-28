package com.vteam.study.fw;

import com.vteam.study.an.OsgiService;
import com.vteam.study.an.ReferenceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 * 模拟框架发现ReferenceService注解并自动赋值的功能
 */
@Component
public class ReferenceServiceFramework implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        if (context.getParent() == null) {
            // 获取有@OsgiService注解的Bean列表进行流式处理
            context.getBeansWithAnnotation(OsgiService.class).values().forEach(bean -> {
                try {
                    // 该处Bean对象,如果加入了AOP以后,它是一个代理对象,无法获取原始的注解
                    // 使用AopTargetUtils.getTarget来获取原始对象
                    Arrays.stream(AopTargetUtils.getTarget(bean).getClass().getMethods()).parallel()
                            // 过滤包含有@ReferenceService注解的方法
                            .filter(method -> null != method.getAnnotation(ReferenceService.class))
                            .forEach(method -> {
                                try {
                                    // 默认有ReferenceService注解的方法是一个setter,只有一个参数
                                    Class<?> paramType = method.getParameterTypes()[0];
                                    // 考虑有接口继承的情况,使用父接口查询bean时可能出现多个
                                    String[] beanNamesForType = context.getBeanNamesForType(paramType);
                                    if (beanNamesForType.length > 1) {
                                        Arrays.stream(beanNamesForType)
                                                // 过滤出与setter方法参数匹配的bean
                                                .filter(s -> {
                                                    Object someBean = context.getBean(s);
                                                    return paramType == someBean.getClass().getInterfaces()[0];
                                                }).forEach(s -> {
                                            try {
                                                // 执行setter方法
                                                method.invoke(bean, context.getBean(s));
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                        });
                                    } else {
                                        // 执行setter方法
                                        method.invoke(bean, context.getBean(paramType));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
