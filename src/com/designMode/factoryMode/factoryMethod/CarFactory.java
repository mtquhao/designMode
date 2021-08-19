package com.designMode.factoryMode.factoryMethod;

import com.designMode.factoryMode.factoryMethod.product.Car;
//汽车工厂实现抽象工厂
public class CarFactory implements AbstractFactory {

    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
