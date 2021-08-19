package com.designMode.prototypeMode.deepClone;

public class Main {
    public static void main(String[] args) {
        Prototype p1, p2, p3 = null,p4=null;
        p1 = new Prototype("深拷贝");
        p1.setContent("深拷贝实例");
        p1.setPrototypeChild("深拷贝引用类");


        p2 = p1.clone();
        p2.setPrototypeChild("浅克隆后的引用类");


        try {
            p3 = p1.deepclone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        p3.setPrototypeChild("深克隆后的引用类");

        try {
            p4=p1.deepclone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
