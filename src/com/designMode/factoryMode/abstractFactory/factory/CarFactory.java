package com.designMode.factoryMode.abstractFactory.factory;

import com.designMode.factoryMode.abstractFactory.abstractProduct.Vehicle;
import com.designMode.factoryMode.abstractFactory.abstractFactory.AbstractFactory;
import com.designMode.factoryMode.abstractFactory.abstractProduct.Weaponry;
import com.designMode.factoryMode.abstractFactory.product.Car;
import com.designMode.factoryMode.abstractFactory.product.Tank;

//汽车工厂（陆地运输通用工厂）实现抽象工厂
public class CarFactory implements AbstractFactory {

    //实例化汽车
    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }

    //实例化坦克
    @Override
    public Weaponry makeWeaponry() {
        return new Tank();
    }
}
