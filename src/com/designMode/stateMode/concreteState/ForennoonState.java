package com.designMode.stateMode.concreteState;

import com.designMode.stateMode.State;
import com.designMode.stateMode.Work;

//上午状态
public class ForennoonState extends State {
    @Override
    public void workState(Work w) {
        if(w.hour<12){
            System.out.println("现在是上午"+w.hour+"时");
        }else {
            //大于12转入下午状态
            w.setState(new AfternoonState());
            w.workState();
        }
    }
}
