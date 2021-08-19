package com.designMode.templateMethodMode;


/*
* 模板方法模式：定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变
* 一个算法的结构即可定义该算法的某些特定步骤
* */

public class Main {

    public static void main(String[] args) {
        System.out.println("学生1的试卷：");
        StudentOne studentOne=new StudentOne();
        studentOne.questionOne();
        studentOne.questionTwo();

        System.out.println("\n学生2的试卷：");
        StudentTwo studentTwo=new StudentTwo();
        studentTwo.questionOne();
        studentTwo.questionTwo();
    }
}
