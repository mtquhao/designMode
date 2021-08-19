package com.designMode.prototypeMode.shallowClone;

public class Main {
    public static void main(String[] args) {
        Prototype p1,p2;
        p1=new Prototype();
        p1.setName("我是第一个");
        p1.setContent("我是第一个");
        System.out.println(p1.toString());

        p2=p1.clone();
        p2.setContent("我是克隆得第一个");
        System.out.println(p2.toString());

        Prototype p3=p1.clone();
        p3.setName("我是复制后得第三个实例");
        System.out.println(p3.toString());

        Prototype p4=p1;
        //clone和=区别？
        p4.setName("我是第四个实例");
        System.out.println(p4.toString());

    }
}
