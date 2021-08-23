package com.designMode.stateMode.concreteState;

import com.designMode.stateMode.State;
import com.designMode.stateMode.Work;

//下午状态
public class AfternoonState extends State {
    @Override
    public void workState(Work w) {
        if(w.hour<18){
            System.out.println("现在是下午"+w.hour+"时");
        }else{
            //大于18转入晚上状态
            w.setState(new EveningState());
            w.workState();
        }
    }
}
