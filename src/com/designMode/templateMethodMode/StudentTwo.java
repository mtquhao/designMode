package com.designMode.templateMethodMode;

//学生类继承模板，传入答案（答题卡）
public class StudentTwo extends TestPaperTemplate {

    @Override
    public String solveOne(){
        return "B";
    }

    @Override
    public String solveTwo(){
        return "C";
    }
}
