package com.kx.designpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kx.designpatterns.BehavioralPattern.ObserverPattern.ObserverActivity;
import com.kx.designpatterns.BehavioralPattern.TemplateMethod.TemplateMethodActivity;
import com.kx.designpatterns.CreatorPattern.AbstractFactoryPattern.AbstractFactoryActivity;
import com.kx.designpatterns.CreatorPattern.BuilderPattern.BuilderActivity;
import com.kx.designpatterns.CreatorPattern.FactoryMethodPattern.FactoryMethodActivity;
import com.kx.designpatterns.CreatorPattern.PrototypePattern.PrototypePatternActivity;
import com.kx.designpatterns.CreatorPattern.SimpleFactoryPattern.SimpleFactoryActivity;
import com.kx.designpatterns.StructuralPattern.AdapterPattern.AdapterActivity;
import com.kx.designpatterns.StructuralPattern.FacadePattern.FacadeActivity;
import com.kx.designpatterns.StructuralPattern.FlyWeightPattern.FlyWeightActivity;
import com.kx.designpatterns.StructuralPattern.ProxyPattern.ProxyActivity;
import com.kx.designpatterns.StructuralPattern.WrapperPattern.WrapperActivity;

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
        findViewById(R.id.adapterActivity).setOnClickListener(this);
        findViewById(R.id.wrapperActivity).setOnClickListener(this);
        findViewById(R.id.proxyActivity).setOnClickListener(this);
        findViewById(R.id.flyWeightActivity).setOnClickListener(this);
        findViewById(R.id.facadeActivity).setOnClickListener(this);
        findViewById(R.id.templateMethodActivity).setOnClickListener(this);
        findViewById(R.id.observerActivity).setOnClickListener(this);
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
                case R.id.adapterActivity :
                 startActivity(AdapterActivity.class);
                break;
                case R.id.wrapperActivity :
                 startActivity(WrapperActivity.class);
                break;
                case R.id.proxyActivity :
                 startActivity(ProxyActivity.class);
                break;
                case R.id.flyWeightActivity :
                 startActivity(FlyWeightActivity.class);
                break;
                case R.id.facadeActivity :
                 startActivity(FacadeActivity.class);
                break;
                case R.id.templateMethodActivity :
                 startActivity(TemplateMethodActivity.class);
                break;
                case R.id.observerActivity :
                 startActivity(ObserverActivity.class);
                break;
        }
    }


    private void startActivity(Class activityClass){
        Intent intent = new Intent(this,activityClass);
        startActivity(intent);
    }
}
