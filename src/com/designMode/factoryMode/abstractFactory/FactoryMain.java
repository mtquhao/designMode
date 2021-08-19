package com.designMode.factoryMode.abstractFactory;

import com.designMode.factoryMode.abstractFactory.factory.AircraftFactory;
import com.designMode.factoryMode.abstractFactory.factory.CarFactory;
import com.designMode.factoryMode.abstractFactory.factory.ShipFactory;

public class FactoryMain {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        carFactory.makeVehicle();
        carFactory.makeWeaponry();
    }
}
