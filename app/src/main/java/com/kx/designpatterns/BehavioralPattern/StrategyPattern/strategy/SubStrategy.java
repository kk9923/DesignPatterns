package com.kx.designpatterns.BehavioralPattern.StrategyPattern.strategy;

/**
 *  地铁价格计算策略
 */
public class SubStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 5;
    }
}
