package com.kx.designpatterns;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kx.designpatterns.FactoryMethodPattern.FactoryMethodActivity;
import com.kx.designpatterns.SimpleFactoryPattern.SimpleFactoryActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.simpleFactoryActivity).setOnClickListener(this);
        findViewById(R.id.factoryMethodActivity).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.simpleFactoryActivity :
                startActivity(SimpleFactoryActivity.class);
                break;
                case R.id.factoryMethodActivity :
                startActivity(FactoryMethodActivity.class);
                break;
        }
    }


    private void startActivity(Class activityClass){
        Intent intent = new Intent(this,activityClass);
        startActivity(intent);
    }
}
