package com.kx.designpatterns.StructuralPattern.ProxyPattern;

/**
 *  真实主题类(也被称为被委托类或被代理类)  ----    执行具体的业务逻辑
 */
 class RealSubject extends Subject {
    @Override
    void buyComputer() {
        System.out.println("购买了一台最新款的MacPro");
    }
}
