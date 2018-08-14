package com.kx.designpatterns.FactoryMethodPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class FactoryMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method);
        //创建Q3的工厂实现类，并生产Q3
        ICar carQ3 = new AudiQ3Factory().creatCar();
        carQ3.drive();
        carQ3.selfNavigation();
        //创建Q5的工厂实现类，并生产Q5
        ICar carQ5 = new AudiQ5Factory().creatCar();
        carQ5.drive();
        carQ5.selfNavigation();
    }
}
