package com.designMode.decoratorMode;


//
public class Person {


    public Person(){}

    private String name;

    public Person(String name){
        this.name=name;
    }

    public void show(){
        System.out.println("装饰的"+name);
    }
}
