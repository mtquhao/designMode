package com.designMode.builderMode;

import com.designMode.builderMode.concreteBuilder.ConcreteBuilderA;
import com.designMode.builderMode.concreteBuilder.ConcreteBuilderB;


/*
* 建造者模式：将一个复杂的对象的构建与他的表示分离，使得同样的的构建过程可以构建不同的表示
* */
public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        ConcreteBuilderA concreteBuilderA=new ConcreteBuilderA();
        ConcreteBuilderB concreteBuilderB=new ConcreteBuilderB();
        System.out.print("A形式构建产品部件:");
        director.construct(concreteBuilderA);
        concreteBuilderA.getResult().show();
        System.out.print("\nB形式构建产品部件:");
        director.construct(concreteBuilderB);
        concreteBuilderB.getResult().show();
    }
}
