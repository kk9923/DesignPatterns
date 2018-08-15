package com.kx.designpatterns.AbstractFactoryPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        IFactory normalFactory = new NormalFactory();
        normalFactory.createTire().createTire();
        normalFactory.createEngine().createEngine();

        System.out.println("-------------------------------");

        IFactory nbFactory = new NBFactory();
        nbFactory.createTire().createTire();
        nbFactory.createEngine().createEngine();
    }

    /**
     *  运行结果
     *
     *   生产普通轮胎
     *   生产国产发动机
     *   -------------------------------
     *   生产越野轮胎
     *   生产进口发动机
     *
     */
}
