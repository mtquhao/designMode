package com.designMode.builderMode.concreteBuilder;

import com.designMode.builderMode.Builder;
import com.designMode.builderMode.Product;

//具体建造者类，继承建造者类。B形式建造产品
public class ConcreteBuilderB extends Builder {

    private Product product=new Product();

    @Override
    public void builderA() {
        product.add("部件X");
    }

    @Override
    public void builderB() {
       product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
