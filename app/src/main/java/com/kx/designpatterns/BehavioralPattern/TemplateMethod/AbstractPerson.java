package com.kx.designpatterns.BehavioralPattern.TemplateMethod;

/**
 *  抽象类
 */
abstract class AbstractPerson {
    //抽象类定义整个流程骨架
    public void prepareGotoSchool(){
        dressUp();
        eatBreakfast();
        takeThings();
    }
    //以下是不同子类根据自身特性完成的具体步骤
     abstract void dressUp();
     abstract void eatBreakfast();
     abstract void takeThings();
}
