package com.designMode.decoratorMode.concreteDecorator;

import com.designMode.decoratorMode.Finery;

public class Jacket extends Finery {
    @Override
    public void show(){
        System.out.print("穿夹克\t");
        super.show();
    }
}
