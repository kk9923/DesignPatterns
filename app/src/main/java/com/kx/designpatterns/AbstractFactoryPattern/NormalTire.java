package com.kx.designpatterns.AbstractFactoryPattern;

/**
 * Created by admin on 2018/8/16.
 * 轮胎产品等级结构  --  具体产品角色
 */
public class NormalTire implements ITire {
    @Override
    public void createTire() {
        System.out.println("生产普通轮胎");
    }
}
