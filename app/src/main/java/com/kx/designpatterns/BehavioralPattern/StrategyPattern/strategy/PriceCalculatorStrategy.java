package com.kx.designpatterns.BehavioralPattern.StrategyPattern.strategy;

/**
 * Created by admin on 2018/9/10.
 */
public class PriceCalculatorStrategy  {

   private CalculateStrategy mCalculateStrategy;

    public PriceCalculatorStrategy(CalculateStrategy calculateStrategy) {
        mCalculateStrategy = calculateStrategy;
    }
    public int calculatePrice(int km){
       return mCalculateStrategy.calculatePrice(km) ;
    }
}
