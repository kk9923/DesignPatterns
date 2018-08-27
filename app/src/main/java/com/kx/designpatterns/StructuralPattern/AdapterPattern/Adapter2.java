package com.kx.designpatterns.StructuralPattern.AdapterPattern;

public class Adapter2 implements Target {
    private Adaptee mAdaptee ;

    public Adapter2(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void sampleMethod2() {
        System.out.println("我是对象适配器中的sampleMethod2方法");
    }

    public void sampleMethod1() {
        mAdaptee.sampleMethod1();
    }
}
