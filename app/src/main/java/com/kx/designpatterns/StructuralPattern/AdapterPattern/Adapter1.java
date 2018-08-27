package com.kx.designpatterns.StructuralPattern.AdapterPattern;

public class Adapter1 extends Adaptee implements Target{

    @Override
    public void sampleMethod1() {
        super.sampleMethod1();
    }

    @Override
    public void sampleMethod2() {
        System.out.println("我是类适配器中的sampleMethod2方法");
    }
}
