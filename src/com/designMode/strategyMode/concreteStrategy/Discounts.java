package com.designMode.strategyMode.concreteStrategy;

import com.designMode.strategyMode.Strategy;

//折扣算法
public class Discounts extends Strategy {

    double discountsRate=0.0d;

    public Discounts(int discountsNumber){
        discountsRate=discountsNumber/10.0d;
    }

    @Override
    public double algorithm(double money) {
        return money*discountsRate;
    }
}
