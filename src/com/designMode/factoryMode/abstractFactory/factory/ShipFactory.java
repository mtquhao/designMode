package com.designMode.factoryMode.abstractFactory.factory;

import com.designMode.factoryMode.abstractFactory.abstractFactory.AbstractFactory;
import com.designMode.factoryMode.abstractFactory.abstractProduct.Vehicle;
import com.designMode.factoryMode.abstractFactory.abstractProduct.Weaponry;
import com.designMode.factoryMode.abstractFactory.product.Ship;

//轮船工厂实现抽象工厂
public class ShipFactory  implements AbstractFactory {

    @Override
    public Vehicle makeVehicle() {
        return new Ship();
    }

    @Override
    public Weaponry makeWeaponry() {
        return null;
    }
}
