package com.designMode.decoratorMode.concreteDecorator;

import com.designMode.decoratorMode.Finery;

public class Stocking extends Finery {
    @Override
    public void show(){
        System.out.print("穿袜子\t");
        super.show();
    }
}
