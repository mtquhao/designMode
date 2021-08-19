package com.designMode.builderMode;

//抽象建造者类。产品由A和B两个部分组成
public abstract class Builder {

    public abstract void builderA();
    public abstract void builderB();
    public abstract Product getResult();
}
