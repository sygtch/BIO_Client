package com.guo.sky;

import java.lang.reflect.Proxy;

/**
 * @author GuoTianchi
 * @version 1.0
 * @date 2020/4/8 15:43
 */
public class RpcProxyClient {


    public <T> T getInstance(Class<T> clazz){
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(),new Class<?>[]{clazz},new RpcInvocation());
    }

}
