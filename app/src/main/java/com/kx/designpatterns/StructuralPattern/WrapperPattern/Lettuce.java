package com.kx.designpatterns.StructuralPattern.WrapperPattern;

/**
 *  具体装饰类，抽象装饰者的具体实现
 */
public class Lettuce extends HamburgerWrapper {

    public Lettuce(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String getName() {
        return mHamburger.getName() + "  加生菜";
    }

    @Override
    public double getPrice() {
        return mHamburger.getPrice() + 2.5;
    }
}
