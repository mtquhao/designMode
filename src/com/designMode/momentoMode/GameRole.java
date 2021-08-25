package com.designMode.momentoMode;

//游戏时角色状态
public class GameRole {

    public int vitality;
    public int attack;
    public int defense;

    //初始化角色
    public void initState(){
        this.vitality=100;
        this.attack=100;
        this.defense=100;
    }

    //游戏结束
    public void gameOver(){
        this.vitality=0;
        this.attack=0;
        this.defense=0;
    }

    //数据展示
    public void showState(){
        System.out.println("体力："+this.vitality+"\n"+"攻击力："+this.vitality+"\n"+"防御："+this.vitality+"\n");
    }

    //游戏存档
    public RoleStateMomento saveState(){
        return new RoleStateMomento(vitality,attack,defense);
    }


    //游戏读档
    public void recoveryState(RoleStateMomento roleStateMomento){
        this.vitality=roleStateMomento.vitality;
        this.attack=roleStateMomento.attack;
        this.defense=roleStateMomento.defense;
    }
}
