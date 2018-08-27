package com.kx.designpatterns.StructuralPattern.WrapperPattern;


/**
 *   抽象组件 ---  可以是一个接口或抽象类， 充当被装饰的原始对象。
 */
public abstract class Hamburger {
    protected  String name ;

    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
