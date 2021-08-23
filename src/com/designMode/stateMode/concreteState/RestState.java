package com.designMode.stateMode.concreteState;

import com.designMode.stateMode.State;
import com.designMode.stateMode.Work;

//下班状态
public class RestState extends State {
    @Override
    public void workState(Work w) {
        System.out.println("现在是"+w.hour+"时，工作已完成，下班啦");
    }
}
