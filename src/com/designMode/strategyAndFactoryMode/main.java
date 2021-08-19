package com.designMode.strategyAndFactoryMode;

import java.util.Scanner;


/*
* 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化,不会影响到使用算法的客户。
*
*
* 收银系统 策略模式结合工厂模式
* */

//客户端
public class main {



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
            total =  new CashContextFactory(type).getResult(total);
            System.out.println("商品单价:" + price + "元/件\t商品数量：" + number + "件\t合计:" + total + "元\n");
        }


    }


}
