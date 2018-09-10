package com.kx.designpatterns.BehavioralPattern.StrategyPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.BehavioralPattern.StrategyPattern.strategy.BusStrategy;
import com.kx.designpatterns.BehavioralPattern.StrategyPattern.strategy.PriceCalculatorStrategy;
import com.kx.designpatterns.R;

public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_pattern);
        //  原始写法  PriceCalculator承担了计算公交车和地铁乘座价格的职责，并不是但一职责，
        //  当我们增加一种出行方式时，就需要增加一个方法来计算出租车的价格，并且修改calculatePrice方法，增加一个判断。
        int busPrice = PriceCalculator.calculatePrice(5, PriceCalculator.BUS);
        System.out.println("原始写法 ： "+busPrice);

        BusStrategy busStrategy = new BusStrategy();
        PriceCalculatorStrategy priceCalculatorStrategy = new PriceCalculatorStrategy(busStrategy);
        int strategyBusPrice = priceCalculatorStrategy.calculatePrice(5);
        System.out.println("策略模式写法 ： "+strategyBusPrice);
    }
}
