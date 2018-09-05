package com.kx.designpatterns.BehavioralPattern.ObserverPattern.pull;

/**
 * Created by admin on 2018/9/5.
 */
public class PullConcreteSubject extends PullSubject {

    private String content;

    public String getContent() {
        return content;
    }


    public void  notifyDataChanged(String content){
        this.content = content ;
        //setChanged();
        notifyObservers();
    }

}
