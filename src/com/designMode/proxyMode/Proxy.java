package com.designMode.proxyMode;


//请求代理
public class Proxy extends Network {

    private Network realNetwork;


    @Override
    public void request() {
        if(realNetwork==null){
            realNetwork=new RealNetwork();
        }

        System.out.println("我替他伪装");

        realNetwork.request();
    }
}
