package com.designMode.strategyMode.concreteStrategy;

import com.designMode.strategyMode.Strategy;

//满减算法
public class FullReduction extends Strategy {
    private int pullMoney;
    private int returnMoney;
    public FullReduction(int pullMoney, int returnMoney){
        this.pullMoney=pullMoney;
        this.returnMoney=returnMoney;
    }

    @Override
    public double algorithm(double money) {
        if(money>=pullMoney){
            money=money-Math.floor(money/pullMoney)*returnMoney;
        }
        return money;
    }
}
