package com.kx.designpatterns.CreatorPattern.SimpleFactoryPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class SimpleFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        ToyFactory.creatToy("WoMenToy");
        ToyFactory.creatToy("ManToy");
        ToyFactory.creatToy("ChildToy");


        System.out.println("----------------------------------------------");

        IToy woMenToy = ToyFactory.creatToy(WoMenToy.class);
        System.out.println("玩具Name =  "  + woMenToy.getName() + "    价格 =   " + woMenToy.price()  );
        IToy manToy = ToyFactory.creatToy(ManToy.class);
        System.out.println("玩具Name =  "  + manToy.getName() + "    价格 =   " + manToy.price()  );
    }
}
