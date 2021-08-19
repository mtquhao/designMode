package com.designMode.decoratorMode;

public class Finery extends Person{

    protected Person component;

    public void Decorator(Person component){
        this.component=component;
    }

    @Override
    public void show(){
        if(component!=null){
            component.show();
        }
    }
}
