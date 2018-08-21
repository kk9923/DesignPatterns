package com.kx.designpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kx.designpatterns.CreatorPattern.AbstractFactoryPattern.AbstractFactoryActivity;
import com.kx.designpatterns.CreatorPattern.BuilderPattern.BuilderActivity;
import com.kx.designpatterns.CreatorPattern.FactoryMethodPattern.FactoryMethodActivity;
import com.kx.designpatterns.CreatorPattern.PrototypePattern.PrototypePatternActivity;
import com.kx.designpatterns.CreatorPattern.SimpleFactoryPattern.SimpleFactoryActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.simpleFactoryActivity).setOnClickListener(this);
        findViewById(R.id.factoryMethodActivity).setOnClickListener(this);
        findViewById(R.id.abstractFactoryActivity).setOnClickListener(this);
        findViewById(R.id.builderActivity).setOnClickListener(this);
        findViewById(R.id.prototypeActivity).setOnClickListener(this);
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
                case R.id.abstractFactoryActivity :
                 startActivity(AbstractFactoryActivity.class);
                break;
                case R.id.builderActivity :
                 startActivity(BuilderActivity.class);
                break;
                case R.id.prototypeActivity :
                 startActivity(PrototypePatternActivity.class);
                break;
        }
    }


    private void startActivity(Class activityClass){
        Intent intent = new Intent(this,activityClass);
        startActivity(intent);
    }
}
