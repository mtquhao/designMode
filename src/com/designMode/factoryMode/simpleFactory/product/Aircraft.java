package com.designMode.factoryMode.simpleFactory.product;

import com.designMode.factoryMode.simpleFactory.Vehicle;

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
