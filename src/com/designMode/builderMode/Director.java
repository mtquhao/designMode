package com.designMode.builderMode;

//指挥者类
public class Director {

    //产品构建过程
    public void construct(Builder builder){
        builder.builderA();
        builder.builderB();
    }

}
