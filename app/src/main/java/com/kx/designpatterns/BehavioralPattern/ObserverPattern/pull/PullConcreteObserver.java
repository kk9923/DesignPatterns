package com.kx.designpatterns.BehavioralPattern.ObserverPattern.pull;

/**
 * Created by admin on 2018/9/5.
 */
public class PullConcreteObserver implements PullObserver {

    @Override
    public void update(PullSubject pushSubject) {
        System.out.println("拉模式  PullSubject 更新的内容 :" +  ((PullConcreteSubject)pushSubject).getContent());
    }

}
