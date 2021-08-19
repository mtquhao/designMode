package com.designMode.proxyMode;

//真实的请求
public class RealNetwork extends Network {
    @Override
    public void request() {
        System.out.println("所有的一切都是我干的");
        System.out.println("真实的请求");
    }
}
