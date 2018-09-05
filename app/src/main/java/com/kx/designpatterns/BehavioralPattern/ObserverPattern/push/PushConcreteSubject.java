package com.kx.designpatterns.BehavioralPattern.ObserverPattern.push;

/**
 * Created by admin on 2018/9/5.
 */
public class PushConcreteSubject extends PushSubject {

    public void  notifyDataChanged(String content){
        //setChanged();
        notifyObservers(content);
    }

}
