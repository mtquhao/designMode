package com.designMode.templateMethodMode;


//学生类继承模板，传入答案（答题卡）
public class StudentOne extends TestPaperTemplate {


    @Override
    public String solveOne(){
        return "A";
    }

    @Override
    public String solveTwo(){
        return "B";
    }
}
