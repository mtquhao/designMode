package com.designMode.momentoMode;


//角色状态储存
public class RoleStateMomento {

    public int vitality;
    public int attack;
    public int defense;

    public RoleStateMomento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }
}
