package com.kx.designpatterns.BehavioralPattern.StrategyPattern.strategy;

/**
 *  公交价格计算策略
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 2;
    }
}
