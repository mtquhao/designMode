package com.designMode.prototypeMode.shallowClone;

public  class Prototype implements Cloneable {

    private String name;
    private String content;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        //需要实现cloneable的接口，直接继承object就好，它里面自带一个clone方法！
        Object obj = null;
        try {
            obj = super.clone();
            return (Prototype) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆方法！");
            return null;
        }


    }



}

