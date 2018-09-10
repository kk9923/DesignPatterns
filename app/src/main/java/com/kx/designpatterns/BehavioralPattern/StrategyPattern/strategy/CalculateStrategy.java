package com.kx.designpatterns.BehavioralPattern.StrategyPattern.strategy;

/**
 * Created by admin on 2018/9/10.
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     *  按距离来计算价格
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
