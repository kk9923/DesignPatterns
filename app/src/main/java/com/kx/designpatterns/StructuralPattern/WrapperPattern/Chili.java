package com.kx.designpatterns.StructuralPattern.WrapperPattern;

/**
 * Created by admin on 2018/8/27.
 */
public class Chili extends HamburgerWrapper {

    public Chili(Hamburger hamburger) {
       super(hamburger);
    }

    @Override
    public String getName() {
        return mHamburger.getName() + "  加辣椒";
    }

    @Override
    public double getPrice() {
        return mHamburger.getPrice() + 0.5;
    }
    public void addMoreChili(){
        System.out.println( getName()+"    超辣");
    }
}
