package com.designMode.factoryMode.simpleFactory;

import com.designMode.factoryMode.simpleFactory.product.Aircraft;
import com.designMode.factoryMode.simpleFactory.product.Car;
import com.designMode.factoryMode.simpleFactory.product.Ship;

public class FactoryMain {
    public static void main(String[] args) {
        //实例化交通工具工厂
        VehicleFactory vehicleFactory=new VehicleFactory();
        //生产飞机
        Aircraft aircraft= (Aircraft) vehicleFactory.makeVehicle("aircraft");
        //生产汽车
        Car car= (Car) vehicleFactory.makeVehicle("car");
        //生产轮船
        Ship ship= (Ship) vehicleFactory.makeVehicle("ship");
    }
}
