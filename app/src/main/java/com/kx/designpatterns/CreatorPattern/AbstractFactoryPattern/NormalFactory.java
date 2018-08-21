package com.kx.designpatterns.CreatorPattern.AbstractFactoryPattern;

/**
 * Created by admin on 2018/8/16.
 *
 *  具体的工厂角色 生成一组具体的产品，  每个产品都位于某个产品等级结构中(继承结构)
 */
public class NormalFactory extends IFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new NormalEngine();
    }
}
