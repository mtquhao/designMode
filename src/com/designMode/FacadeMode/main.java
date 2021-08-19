package com.designMode.FacadeMode;


/*
*
* 外观模式：为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口
* 使得这一子系统更加容易使用
* */

public class main {

    public static void main(String[] args) {
        Fund fund=new Fund();
        fund.buyFund();
        fund.sellFund();
    }

}
