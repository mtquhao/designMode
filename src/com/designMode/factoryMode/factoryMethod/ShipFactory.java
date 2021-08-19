package com.designMode.factoryMode.factoryMethod;

import com.designMode.factoryMode.factoryMethod.product.Ship;

//轮船工厂实现抽象工厂
public class ShipFactory  implements AbstractFactory{

    @Override
    public Vehicle makeVehicle() {
        return new Ship();
    }
}
