package com.designMode.decoratorMode;

import com.designMode.decoratorMode.concreteDecorator.*;

/*
* 装饰模式：动态的给一个对象添加额外的职责，就新增功能来说，装饰模式比生成子类更加灵活
* */
public class main {
    public static void main(String[] args) {
        Person quhao=new Person("屈浩");
        System.out.print("第一种穿衣方式：\t");
        Jeans jeans=new Jeans();
        Stocking stocking=new Stocking();
        TShirt tShirt=new TShirt();

        stocking.Decorator(quhao);
        jeans.Decorator(stocking);
        tShirt.Decorator(jeans);
        tShirt.show();

        System.out.print("第二种穿衣方式：\t");
        Briefs briefs=new Briefs();
        Jacket jacket=new Jacket();
        Shoes shoes=new Shoes();

        shoes.Decorator(quhao);
        briefs.Decorator(shoes);
        jacket.Decorator(briefs);
        jacket.show();
    }
}
