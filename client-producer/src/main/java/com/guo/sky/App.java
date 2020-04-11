package com.guo.sky;

/**
 * @author GuoTianchi
 * @version 1.0
 * @date 2020/4/8 15:43
 */
public class App {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        ServerService instance = rpcProxyClient.getInstance(ServerService.class);
        String user = instance.getUser();
        System.out.println(user);
    }

}
