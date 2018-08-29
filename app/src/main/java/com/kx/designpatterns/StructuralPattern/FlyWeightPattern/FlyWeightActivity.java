package com.kx.designpatterns.StructuralPattern.FlyWeightPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class FlyWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fly_weight);

        TicketFlyWeight ticket1 = FlyWeightFactory.getTicket("武汉", "北京");
        ticket1.buyTicketInfo("上铺");

        TicketFlyWeight ticket2 = FlyWeightFactory.getTicket("武汉", "北京");
        ticket2.buyTicketInfo("下铺");

        TicketFlyWeight ticket3 = FlyWeightFactory.getTicket("武汉", "北京");
        ticket3.buyTicketInfo("走道");


        System.out.println("缓存容器大小 ：  "+FlyWeightFactory.sTicketMap.size());


        /**
         * 输出结果
         *
         *
         *
         *
         *   创建对象  ==> 武汉-北京
             购买 从武汉  到  北京  的火车票   ticketType上铺  ,价格 ：  100

             使用缓存  ==> 武汉-北京
             购买 从武汉  到  北京  的火车票   ticketType下铺  ,价格 ：  200

             使用缓存  ==> 武汉-北京
             购买 从武汉  到  北京  的火车票   ticketType走道  ,价格 ：  10

             缓存容器大小 ：  1
         *
         *
         *
         *
         *
         *
         *
         *
         */

    }
}
