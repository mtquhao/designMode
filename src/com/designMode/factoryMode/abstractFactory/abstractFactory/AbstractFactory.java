package com.designMode.factoryMode.abstractFactory.abstractFactory;

import com.designMode.factoryMode.abstractFactory.abstractProduct.Vehicle;
import com.designMode.factoryMode.abstractFactory.abstractProduct.Weaponry;

//交通工具抽线工厂
public interface AbstractFactory {
    Vehicle makeVehicle();

    Weaponry makeWeaponry();
}
