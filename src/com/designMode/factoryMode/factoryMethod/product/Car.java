package com.designMode.factoryMode.factoryMethod.product;

import com.designMode.factoryMode.factoryMethod.Vehicle;

//汽车类实现交通工具接口
public class Car implements Vehicle {
    public Car(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造汽车");
    }
}
