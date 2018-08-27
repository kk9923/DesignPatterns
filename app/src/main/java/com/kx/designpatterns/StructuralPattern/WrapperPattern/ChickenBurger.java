package com.kx.designpatterns.StructuralPattern.WrapperPattern;

/**
 *   组件具体实现类 ---  被装饰的具体对象
 */
public class ChickenBurger extends Hamburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
