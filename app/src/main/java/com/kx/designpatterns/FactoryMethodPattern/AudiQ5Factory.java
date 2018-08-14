package com.kx.designpatterns.FactoryMethodPattern;

/**
 * Created by admin on 2018/8/14.
 * 汽车工厂的具体具体实现类
 */
public class AudiQ5Factory extends ICarFactory {
    @Override
    ICar creatCar() {
        return new AudiQ5();
    }
}
