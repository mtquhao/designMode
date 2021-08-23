package com.designMode.stateMode.concreteState;

import com.designMode.stateMode.State;
import com.designMode.stateMode.Work;

//晚上状态
public class EveningState extends State {

    @Override
    public void workState(Work w) {
        if(w.finishWork==false){
            if(w.hour<22){
                System.out.println("现在是"+w.hour+"时，还在加班");
            }else {
                System.out.println(w.hour+"时了，顶不住了，溜了溜了");
            }
        }else{
            //工作完成转入下班状态
            w.setState(new RestState());
            w.workState();
        }
    }
}
