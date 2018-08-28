package com.kx.designpatterns.StructuralPattern.ProxyPattern;

/**
 *  代理类(也被称为委托类)  --   持有一个真实主题的引用
 */
 class ProxySubject extends Subject {

    // 持有一个被代理对象的引用
    private  Subject mSubject ;

     ProxySubject(Subject subject) {
        mSubject = subject;
    }

    @Override
    void buyComputer() {
        mSubject.buyComputer();
    }
}
