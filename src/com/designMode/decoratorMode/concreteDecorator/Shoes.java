package com.designMode.decoratorMode.concreteDecorator;

import com.designMode.decoratorMode.Finery;

public class Shoes extends Finery {
    @Override
    public void show(){
        System.out.print("穿鞋子\t");
        super.show();
    }
}
