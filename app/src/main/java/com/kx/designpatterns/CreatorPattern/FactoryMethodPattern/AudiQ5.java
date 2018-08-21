package com.kx.designpatterns.CreatorPattern.FactoryMethodPattern;

/**
 * Created by admin on 2018/8/14.
 * 汽车的具体实现类
 */
public class AudiQ5 extends ICar {
    @Override
    void drive() {
        System.out.println("Q5开车了");
    }

    @Override
    void selfNavigation() {
        System.out.println("Q5开启自动导航");
    }
}
