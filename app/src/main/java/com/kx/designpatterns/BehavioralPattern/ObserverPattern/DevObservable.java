package com.kx.designpatterns.BehavioralPattern.ObserverPattern;

import java.util.Observable;

/**
 * Created by admin on 2018/9/5.
 */
public class DevObservable extends Observable {

    public void  notifyDataChanged(String content){
        setChanged();
        notifyObservers(content);
    }

}
