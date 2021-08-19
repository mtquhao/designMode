package com.designMode.factoryMode.abstractFactory.factory;

import com.designMode.factoryMode.abstractFactory.abstractFactory.AbstractFactory;
import com.designMode.factoryMode.abstractFactory.abstractProduct.Vehicle;
import com.designMode.factoryMode.abstractFactory.abstractProduct.Weaponry;
import com.designMode.factoryMode.abstractFactory.product.Aircraft;

//飞机工厂实现抽象工厂
public class AircraftFactory implements AbstractFactory {
    @Override
    public Vehicle makeVehicle() {
        return new Aircraft();
    }

    @Override
    public Weaponry makeWeaponry() {
        return null;
    }
}
