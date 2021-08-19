package com.designMode.strategyMode.concreteStrategy;

import com.designMode.strategyMode.Strategy;

//正常收费
public class normalCharge extends Strategy {


    @Override
    public double algorithm(double money) {
        return money;
    }
}
