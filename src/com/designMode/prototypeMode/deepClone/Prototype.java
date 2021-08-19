package com.designMode.prototypeMode.deepClone;

import java.io.*;

public  class Prototype implements Cloneable, Serializable {

    private String name;
    private String content;

    private  PrototypeChild prototypeChild;

    public Prototype(String name) {
        this.name = name;
        prototypeChild=new PrototypeChild();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PrototypeChild getPrototypeChild() {
        return prototypeChild;
    }

    public void setPrototypeChild(String name) {
        prototypeChild.name=name;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", prototypeChild=" + prototypeChild.getName() +
                '}';
    }

    //浅克隆
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

    //深克隆
    public Prototype deepclone() throws Exception {
        //将对象写入流中,
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象取出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bi);
        return (Prototype) ois.readObject();

    }



}

