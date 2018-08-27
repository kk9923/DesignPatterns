package com.kx.designpatterns.StructuralPattern.AdapterPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        Adapter1 adapter = new Adapter1();
        adapter.sampleMethod1();
        adapter.sampleMethod2();

        System.out.println("-----------------------------------");

        Adaptee adaptee = new Adaptee();
        Adapter2 adapter2 = new Adapter2(adaptee);
        adapter2.sampleMethod1();
        adapter2.sampleMethod2();


    }
}
