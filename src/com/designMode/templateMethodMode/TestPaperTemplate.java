package com.designMode.templateMethodMode;


//试卷模板（问卷）
public class TestPaperTemplate {


    public void questionOne(){
        System.out.println("1+1=？");
        System.out.println("A.1  B.-1  C.2  D.-2");
        System.out.println("答案："+solveOne());
    }

    public void questionTwo(){
        System.out.println("2+1=？");
        System.out.println("A.1  B.-1  C.2  D.-2");
        System.out.println("答案："+solveTwo());
    }

    public String solveOne(){
        return "";
    }

    public String solveTwo(){
        return "";
    }
}
