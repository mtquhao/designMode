package com.designMode.factoryMode.abstractFactory.product;

import com.designMode.factoryMode.abstractFactory.abstractProduct.Vehicle;

//轮船类实现交通工具接口
public class Ship implements Vehicle {
    public Ship(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造轮船");
    }
}
