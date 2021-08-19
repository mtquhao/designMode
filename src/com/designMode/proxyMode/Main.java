package com.designMode.proxyMode;


import java.util.ArrayList;
import java.util.List;

/*
* 代理模式：为其他对象提供一种代理以控制对这个对象的访问
* */
public class Main {

    public static void main(String[] args) {

        //只需调用代理请求，不要管真实请求。代理为我们处理
        Proxy proxy=new Proxy();
        proxy.request();

       long a=3L;
       int b=(int)a;


        System.out.println(b);
    }
}
