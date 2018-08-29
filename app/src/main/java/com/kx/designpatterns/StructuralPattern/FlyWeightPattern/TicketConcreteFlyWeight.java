package com.kx.designpatterns.StructuralPattern.FlyWeightPattern;

/**
 * 具体享元角色
 */
public class TicketConcreteFlyWeight implements TicketFlyWeight {
    private String from;
    private String to;

     TicketConcreteFlyWeight(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void buyTicketInfo(String ticketType) {
        System.out.println("购买 从" + from +"  到  " + to + "  的火车票   ticketType"  + ticketType
            + "  ,价格 ：  " +     getTicketPrice(ticketType)
        );
    }

    private int getTicketPrice(String ticketType){
        if ("坐票".equals(ticketType)){
            return 50;
        }else if ("上铺".equals(ticketType)){
            return 100;
        }else if ("下铺".equals(ticketType)){
            return 200;
        }else {
            return  10;
        }
    }
}
