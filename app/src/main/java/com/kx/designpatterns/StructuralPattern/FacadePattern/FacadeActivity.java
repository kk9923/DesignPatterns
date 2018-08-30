package com.kx.designpatterns.StructuralPattern.FacadePattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);
        Facade facade = new Facade();
        facade.testA();
        facade.testB();
        facade.testC();
    }
}
