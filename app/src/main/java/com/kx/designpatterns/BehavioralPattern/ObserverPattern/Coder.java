package com.kx.designpatterns.BehavioralPattern.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by admin on 2018/9/5.
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Hi , "   + name +"  , 您订阅的报纸已经更新啦。" + arg );
    }
}
