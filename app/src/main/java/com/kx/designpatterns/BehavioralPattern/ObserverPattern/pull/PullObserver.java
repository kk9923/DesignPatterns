package com.kx.designpatterns.BehavioralPattern.ObserverPattern.pull;


/**
 *  拉模型 --  抽象观察者 --- ( Observer )
 */
public interface PullObserver {
    void update(PullSubject pushSubject);
}
