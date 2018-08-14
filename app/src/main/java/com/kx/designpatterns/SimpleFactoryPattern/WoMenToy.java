package com.kx.designpatterns.SimpleFactoryPattern;

/**
 * 具体的玩具类--- 女人玩具
 */
public class WoMenToy implements IToy {

    @Override
    public String getName() {
        return "WoMenToy";
    }

    @Override
    public float price() {
        return 50;
    }
}
