package com.kx.designpatterns.StructuralPattern.WrapperPattern;

/**
 *   抽象装饰者，内部一定要有一个指向组件对象的引用.
 */
public abstract class HamburgerWrapper extends Hamburger {

    protected Hamburger mHamburger ;

    public HamburgerWrapper(Hamburger hamburger) {
        mHamburger = hamburger;
    }

    public abstract String getName();

    @Override
    public double getPrice() {
        return mHamburger.getPrice();
    }
}
