package com.designMode.strategyMode;

import com.designMode.strategyMode.concreteStrategy.Discounts;
import com.designMode.strategyMode.concreteStrategy.FullReduction;
import com.designMode.strategyMode.concreteStrategy.normalCharge;

import java.util.Scanner;


/*
* 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化,不会影响到使用算法的客户。
*
*
* 收银系统
* */

//客户端
public class main {

    static int type = 1;
    static CashContext discountsPrice = null;
    static private int pullMoney;
    static  private int returnMoney;
    static int discountsNumber = 10;

    public static void main(String[] args) {

        double total = 0.0d;



        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入商品单价：");
            double price = sc.nextDouble();
            System.out.println("请输入商品个数：");
            int number = sc.nextInt();
            total = price * number;
            System.out.println("请选择活动：1.正常收费 2.满减 3.打折");
            int type = sc.nextInt();
            if(type==2){
                System.out.println("满：");
                pullMoney = sc.nextInt();
                System.out.println("减");
                returnMoney=sc.nextInt();
            }else if(type==3){
                System.out.println("请输入折扣");
                discountsNumber = sc.nextInt();
            }
            discountsType(type);
            total = discountsPrice.getResult(total);
            System.out.println("商品单价:" + price + "元/件\t商品数量：" + number + "件\t合计:" + total + "元\n");
        }


    }

    public static void discountsType(int type) {
        switch (type) {
            case 1:
                discountsPrice = new CashContext(new normalCharge());
                break;
            case 2:
                discountsPrice = new CashContext(new FullReduction(pullMoney, returnMoney));
                break;
            case 3:
                discountsPrice = new CashContext(new Discounts(discountsNumber));
                break;
        }
    }

}
