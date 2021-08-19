package com.designMode.factoryMode.factoryMethod.product;

import com.designMode.factoryMode.factoryMethod.Vehicle;

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
