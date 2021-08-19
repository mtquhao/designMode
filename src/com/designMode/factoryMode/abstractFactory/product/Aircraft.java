package com.designMode.factoryMode.abstractFactory.product;

import com.designMode.factoryMode.abstractFactory.abstractProduct.Vehicle;

//飞机类实现交通工具
public class Aircraft implements Vehicle {
    public Aircraft(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造飞机");
    }
}
