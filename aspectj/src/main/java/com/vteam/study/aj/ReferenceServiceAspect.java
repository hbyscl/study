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
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
@Component
@Aspect
public class ReferenceServiceAspect {
    @Pointcut("@annotation(com.vteam.study.an.ReferenceService)")
    public void doReferenceService() {
    }

    @Around("doReferenceService()")
    public UserService doSetObject(ProceedingJoinPoint pjp) {
        try {
            Class<?> intfClz = pjp.getArgs()[0].getClass().getInterfaces()[0];
            System.out.println("intfClz = " + intfClz);
            pjp.proceed(new Object[]{ApiFactory.getApi(intfClz)});
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
