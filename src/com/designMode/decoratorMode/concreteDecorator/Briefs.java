package com.designMode.decoratorMode.concreteDecorator;

import com.designMode.decoratorMode.Finery;

public class Briefs extends Finery {
    @Override
    public void show(){
        System.out.print("穿内裤\t");
        super.show();
    }
}
