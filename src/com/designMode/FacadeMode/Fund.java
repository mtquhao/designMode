package com.designMode.FacadeMode;

import com.designMode.FacadeMode.stock.StockA;
import com.designMode.FacadeMode.stock.StockB;
import com.designMode.FacadeMode.stock.StockC;
import com.designMode.FacadeMode.stock.StockD;

//基金（该基本包含股票A，B，C，D）
public class Fund {

    StockA stockA;
    StockB stockB;
    StockC stockC;
    StockD stockD;

    public Fund() {
        stockA = new StockA();
        stockB = new StockB();
        stockC = new StockC();
        stockD = new StockD();
    }


    //买入基金
    public void buyFund() {
        System.out.println("买入基金");
        stockA.buy();
        stockB.buy();
        stockC.buy();
        stockD.buy();
    }

    //卖出基金
    public void sellFund() {
        System.out.println("卖出基金");
        stockA.sell();
        stockB.sell();
        stockC.sell();
        stockD.sell();
    }

}
