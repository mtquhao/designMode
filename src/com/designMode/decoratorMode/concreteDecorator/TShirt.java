package com.designMode.decoratorMode.concreteDecorator;

import com.designMode.decoratorMode.Finery;

public class TShirt extends Finery {
    @Override
    public void show(){
        System.out.print("穿T恤\t");
        super.show();
    }
}
