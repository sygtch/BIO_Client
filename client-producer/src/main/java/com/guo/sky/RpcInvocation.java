package com.guo.sky;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author GuoTianchi
 * @version 1.0
 * @date 2020/4/8 15:48
 */
public class RpcInvocation implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
        Request request = new Request();
        request.setClazzName(className);
        request.setMethod(methodName);
        request.setParams(args);
        RpcNetTransport rpcNetTransport = new RpcNetTransport();
        Object object = rpcNetTransport.send(request);
        return object;
    }

}
