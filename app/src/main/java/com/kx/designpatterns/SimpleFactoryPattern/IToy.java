package com.kx.designpatterns.SimpleFactoryPattern;

/**
 * 抽象的玩具类
 */
interface IToy {
    /**
     * 名字
     */
    String getName();

    /**
     * 价格
     */
    float price();
}
