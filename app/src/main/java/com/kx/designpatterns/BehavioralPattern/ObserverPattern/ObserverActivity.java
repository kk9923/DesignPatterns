package com.kx.designpatterns.BehavioralPattern.ObserverPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.BehavioralPattern.ObserverPattern.pull.PullConcreteObserver;
import com.kx.designpatterns.BehavioralPattern.ObserverPattern.pull.PullConcreteSubject;
import com.kx.designpatterns.BehavioralPattern.ObserverPattern.push.PushConcreteObserver;
import com.kx.designpatterns.BehavioralPattern.ObserverPattern.push.PushConcreteSubject;
import com.kx.designpatterns.R;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);


        PullConcreteSubject pullConcreteSubject = new PullConcreteSubject();
        PullConcreteObserver pullConcreteObserver = new PullConcreteObserver();
        pullConcreteSubject.registerObserver(pullConcreteObserver);
        pullConcreteSubject.notifyDataChanged("今日新闻, 刘强东出轨");


        PushConcreteSubject pushConcreteSubject = new PushConcreteSubject();
        PushConcreteObserver pushConcreteObserver = new PushConcreteObserver();

        pushConcreteSubject.registerObserver(pushConcreteObserver);
        pushConcreteSubject.notifyDataChanged("今日新闻, 刘强东又出轨");


        Coder coder1 = new Coder("coder1👌");
        Coder coder2 = new Coder("coder2👌");
        Coder coder3 = new Coder("coder3👌");
        Coder coder4 = new Coder("coder4👌");

        DevObservable devObservable = new DevObservable();
        devObservable.addObserver(coder1);
        devObservable.addObserver(coder2);


        devObservable.addObserver(coder3);
        devObservable.addObserver(coder4);

       devObservable.notifyDataChanged("新一期的新闻出来了：刘强东的花边新闻");














    }
}
