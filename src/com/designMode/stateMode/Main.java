package com.designMode.stateMode;


/*
* 状态模式：当一个对象的内在状态改变时允许改变其他行为，这个对象看起来像是改变了其类。
* */
public class Main {
    public static void main(String[] args) {


        Work w=new Work();
       // w.finishWork=true;
        w.hour=8;
        w.workState();

        w.hour=13;
        w.workState();

        w.hour=18;
        w.workState();

        w.hour=20;
        w.workState();

        w.hour=23;
        w.workState();
    }
}
