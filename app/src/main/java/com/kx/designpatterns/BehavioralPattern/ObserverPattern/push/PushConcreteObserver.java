package com.kx.designpatterns.BehavioralPattern.ObserverPattern.push;

/**
 * Created by admin on 2018/9/5.
 */
public class PushConcreteObserver implements PushObserver {

    @Override
    public void update(Object arg) {
        System.out.println("推模式  PushSubject 更新内容了 :" +  arg);
    }

}
