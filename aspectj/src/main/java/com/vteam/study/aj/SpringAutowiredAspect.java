package com.vteam.study.aj;

import com.vteam.study.api.UserService;
import com.vteam.study.fw.ApiFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月17日
 * @since soter 1.0.0
 */
@Component
@Aspect
public class SpringAutowiredAspect {
    @Pointcut("@annotation(org.springframework.beans.factory.annotation.Autowired)")
    public void doAutowired() {
    }

    @Around("doAutowired()")
    public UserService doSetObject(ProceedingJoinPoint pjp) {
        try {
            System.out.println("SpringAutowiredAspect.doSetObject+"+pjp);
            pjp.proceed();
            System.out.println("SpringAutowiredAspect.doSetObject-"+pjp);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
