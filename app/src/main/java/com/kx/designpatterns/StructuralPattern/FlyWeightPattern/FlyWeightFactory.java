package com.kx.designpatterns.StructuralPattern.FlyWeightPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  享元工厂
 */
public class FlyWeightFactory  {

   public static Map<String,TicketConcreteFlyWeight> sTicketMap = new ConcurrentHashMap<>();

    public static TicketFlyWeight getTicket(String from,String to){
        String key = from + "-" + to;
        TicketConcreteFlyWeight ticketConcreteFlyWeight = sTicketMap.get(key);
        if (ticketConcreteFlyWeight ==null){
            System.out.println("创建对象  ==> " +key);
            ticketConcreteFlyWeight = new TicketConcreteFlyWeight(from,to);
            sTicketMap.put(key,ticketConcreteFlyWeight);
            return ticketConcreteFlyWeight ;
        }
        System.out.println("使用缓存  ==> " +key);
        return ticketConcreteFlyWeight ;
    }
}
