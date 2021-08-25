package com.designMode.momentoMode;


/*
* 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将对象恢复到原来保存的状态
* */
public class Main {
    public static void main(String[] args) {

        GameRole role=new GameRole();
        System.out.println("初始化角色");
        role.initState();
        role.showState();

        System.out.println("打boos前存档");
        RealRoleStateCreateker realRoleStateCreateker=new RealRoleStateCreateker();
        realRoleStateCreateker.setRoleStateMomento(role.saveState());

        System.out.println("打boos失败，游戏结束");
        role.gameOver();
        role.showState();

        System.out.println("读档，恢复游戏");
        role.recoveryState(realRoleStateCreateker.getRoleStateMomento());
        role.showState();
    }
}
