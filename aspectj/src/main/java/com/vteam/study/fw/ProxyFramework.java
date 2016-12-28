package com.vteam.study.fw;

import com.vteam.study.an.OsgiService;
import com.vteam.study.an.ReferenceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
//@Component
public class ProxyFramework implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        if(context.getParent()==null){
            Map<String,Object> beans = context.getBeansWithAnnotation(OsgiService.class);
            for(Object bean:beans.values()){
                try {
                    Object baseClz = AopTargetUtils.getTarget(bean);
                    Method[] methods = baseClz.getClass().getMethods();
                    for (Method method : methods) {
                        if(null != method.getAnnotation(ReferenceService.class)){
                            try {
                                Class<?> paramType = method.getParameterTypes()[0];
                                String[] beanNamesForType = context.getBeanNamesForType(paramType);
                                if(beanNamesForType.length > 1){
                                    for (String s : beanNamesForType) {
                                        Object someBean = context.getBean(s);
                                        if(paramType == someBean.getClass().getInterfaces()[0]){
                                            method.invoke(bean, someBean);
                                            break;
                                        }
                                    }
                                }
                                else{
                                    method.invoke(bean, context.getBean(paramType));
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
