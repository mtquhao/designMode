package com.designMode.strategyAndFactoryMode;

import com.designMode.strategyAndFactoryMode.concreteStrategy.Discounts;
import com.designMode.strategyAndFactoryMode.concreteStrategy.FullReduction;
import com.designMode.strategyAndFactoryMode.concreteStrategy.normalCharge;

import java.util.Scanner;

//优惠工厂
public class CashContextFactory {

    private Strategy strategy;
    static private int pullMoney;
    static private int returnMoney;
    static int discountsNumber = 10;
    Scanner sc = new Scanner(System.in);

    //通过构造方法，传入需要执行算法的类型
    public CashContextFactory(int type) {
        switch (type) {
            case 1:
                strategy = new normalCharge();
                break;
            case 2:
                System.out.println("满：");
                pullMoney = sc.nextInt();
                System.out.println("减");
                returnMoney = sc.nextInt();
                strategy = new FullReduction(pullMoney, returnMoney);
                break;
            case 3:
                System.out.println("请输入折扣");
                discountsNumber = sc.nextInt();
                strategy = new Discounts(discountsNumber);
                break;
        }
    }

    public double getResult(double money) {
        return strategy.algorithm(money);
    }

}
