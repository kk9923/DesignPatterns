package com.kx.designpatterns.AbstractFactoryPattern;

/**
 * Created by admin on 2018/8/16.
 *  抽象工厂角色     定义一组用于创建 属于不同产品等级结构产品的方法
 */
public abstract class  IFactory {
    /**
     * 生产轮胎
     * @return
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     * @return
     */
    public abstract IEngine createEngine();
}
