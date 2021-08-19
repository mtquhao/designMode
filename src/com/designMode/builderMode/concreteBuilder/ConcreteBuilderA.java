package com.designMode.builderMode.concreteBuilder;

import com.designMode.builderMode.Builder;
import com.designMode.builderMode.Product;

//具体建造者类，继承建造者类。A形式建造产品
public class ConcreteBuilderA extends Builder {

    private Product product=new Product();

    @Override
    public void builderA() {
        product.add("部件A");
    }

    @Override
    public void builderB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
