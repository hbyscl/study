package com.vteam.study.fw;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.UUID;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
public class ApiFactory {

    private static Object $invoke(Class service, Method method, Object[] args) {
        Class<?> returnType = method.getReturnType();
        if (returnType == Integer.class) {
            return Integer.valueOf(11111 + "" + new Random().nextInt(100));
        }
        return "11111" + UUID.randomUUID().toString().substring(0, 5);
    }

    /**
     * 通过CGLIB动态生成指定接口的代理对象
     *
     * @param clz 接口
     * @return 指定接口的动态代理对象
     */
    public static <T> T getApi(Class<T> clz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, methodProxy)
                // 模拟调用RpcServiceInvoker
                -> $invoke(method.getDeclaringClass(), method, args));
        return (T) enhancer.create();
    }


}
