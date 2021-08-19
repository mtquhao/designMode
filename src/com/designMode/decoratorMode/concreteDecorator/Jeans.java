package com.designMode.decoratorMode.concreteDecorator;

import com.designMode.decoratorMode.Finery;

public class Jeans extends Finery {

    @Override
    public void show(){
        System.out.print("穿牛仔裤\t");
        super.show();
    }
}
