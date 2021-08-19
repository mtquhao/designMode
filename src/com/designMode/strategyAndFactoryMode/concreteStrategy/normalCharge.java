package com.designMode.strategyAndFactoryMode.concreteStrategy;

import com.designMode.strategyAndFactoryMode.Strategy;

//正常收费
public class normalCharge extends Strategy {


    @Override
    public double algorithm(double money) {
        return money;
    }
}
