package com.kx.designpatterns.SimpleFactoryPattern;

/**
 * 具体的玩具类--- 儿童玩具
 */
public class ChildToy implements IToy {
    @Override
    public String getName() {
        return "ChildToy";
    }

    @Override
    public float price() {
        return 20;
    }
}
