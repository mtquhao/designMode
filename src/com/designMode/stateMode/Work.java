package com.designMode.stateMode;

import com.designMode.stateMode.concreteState.ForennoonState;

public class Work {

    private State state;

    public Work(){
        //初始话程序时是上午
       state= new ForennoonState();
    }

    //时间
    public double hour;

    //工作完成状态
    public boolean finishWork = false;


    //传入具体状态对象
    public void setState(State s){
        state=s;
    }

    //执行具体对象方法
    public void workState(){
        state.workState(this);
    }
}
