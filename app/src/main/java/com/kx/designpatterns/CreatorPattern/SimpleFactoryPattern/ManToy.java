package com.kx.designpatterns.CreatorPattern.SimpleFactoryPattern;

/**
 * 具体的玩具类--- 女人玩具
 */
public class ManToy implements IToy {
    @Override
    public String getName() {
        return "ManToy";
    }

    @Override
    public float price() {
        return 100;
    }
}
