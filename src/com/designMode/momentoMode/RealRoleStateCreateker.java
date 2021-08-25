package com.designMode.momentoMode;


//存档守护者
public class RealRoleStateCreateker {

    //游戏角色存档状态在这里调用
    private RoleStateMomento roleStateMomento;

    //读档
    public RoleStateMomento getRoleStateMomento() {
        return roleStateMomento;
    }

    //存档
    public void setRoleStateMomento(RoleStateMomento roleStateMomento) {
        this.roleStateMomento = roleStateMomento;
    }
}
