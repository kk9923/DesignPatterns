package com.kx.designpatterns.BehavioralPattern.StrategyPattern;

/**
 * Created by admin on 2018/9/10.
 *  price计算类
 *
 */
public class PriceCalculator {
    //  公交车类型
    public static final  int BUS = 1;
    //  地铁类型
    public static final  int SUBWAY = 2;

    public static int calculatePrice(int km,int type){
        if (type== BUS){
           return busPrice(km);
        }else if (type == SUBWAY){
            return  subwayPrice(km);
        }
        return 0;
    }

    private static int busPrice(int km){
        return 2;
    }
    private static int subwayPrice(int km){
        return 5;
    }

}
