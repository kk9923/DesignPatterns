package com.kx.designpatterns.FactoryMethodPattern;

/**
 * Created by admin on 2018/8/14.
 * 汽车的具体实现类
 */
public class AudiQ3 extends ICar {
    @Override
    void drive() {
        System.out.println("Q3开车了");
    }

    @Override
    void selfNavigation() {
        System.out.println("Q3开启自动导航");
    }
}
