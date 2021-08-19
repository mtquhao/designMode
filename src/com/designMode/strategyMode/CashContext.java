package com.designMode.strategyMode;

//优惠上下文
public class CashContext {

    private Strategy strategy;

    //通过构造方法，传入具体的优惠策略
    public CashContext(Strategy strategy){
        this.strategy=strategy;
    }

    public double getResult(double money){
        return strategy.algorithm(money);
    }

}
