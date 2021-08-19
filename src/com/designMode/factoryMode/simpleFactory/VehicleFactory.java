package com.designMode.factoryMode.simpleFactory;

import com.designMode.factoryMode.simpleFactory.product.Aircraft;
import com.designMode.factoryMode.simpleFactory.product.Car;
import com.designMode.factoryMode.simpleFactory.product.Ship;

//交通工具工厂
public class VehicleFactory {
    public Vehicle makeVehicle(String vehicleType) {
        if (vehicleType.equals("aircraft")) {
            //生产飞机
            return new Aircraft();
        } else if (vehicleType.equals("car")) {
            //生产汽车
            return new Car();
        } else if (vehicleType.equals("ship")) {
            //生产轮船
            return new Ship();
        }
        return null;
    }
}
