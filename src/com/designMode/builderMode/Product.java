package com.designMode.builderMode;

import java.util.ArrayList;
import java.util.List;

//产品类，由多个部分组成
public class Product {
    List<String> list=new ArrayList<>();

    //添加产品部件
    public void add(String part){
        list.add(part);
    }

    //例举所有产品部件
    public void show(){
        for(String l:list){
            System.out.print(l+"\t");
        }
    }
}
