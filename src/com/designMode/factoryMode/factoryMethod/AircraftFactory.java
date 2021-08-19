package com.designMode.factoryMode.factoryMethod;

import com.designMode.factoryMode.factoryMethod.product.Aircraft;
//飞机工厂实现抽象工厂
public class AircraftFactory implements AbstractFactory {
    @Override
    public Vehicle makeVehicle() {
        return new Aircraft();
    }
}
