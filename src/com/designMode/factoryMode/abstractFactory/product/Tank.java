package com.designMode.factoryMode.abstractFactory.product;

import com.designMode.factoryMode.abstractFactory.abstractProduct.Weaponry;

public class Tank implements Weaponry {
    public Tank(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造坦克");
    }
}
