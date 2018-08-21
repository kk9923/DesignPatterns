package com.kx.designpatterns.CreatorPattern.AbstractFactoryPattern;

/**
 * Created by admin on 2018/8/16.
 *  发动机产品等级结构 ---  具体产品角色
 */
public class ImportEngine implements IEngine {
    @Override
    public void createEngine() {
        System.out.println("生产进口发动机");
    }
}
