package com.designMode.factoryMode.factoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        AircraftFactory aircraftFactory=new AircraftFactory();
        aircraftFactory.makeVehicle();
        CarFactory carFactory=new CarFactory();
        carFactory.makeVehicle();
        ShipFactory shipFactory=new ShipFactory();
        shipFactory.makeVehicle();
    }
}
