package com.kx.designpatterns.BehavioralPattern.ObserverPattern.pull;

import java.util.ArrayList;
import java.util.List;

/**
 *  拉模型 --  抽象主题角色 ---   被观察者 ( Observable )
 */
public abstract  class PullSubject {

    /**
     * 用来保存注册的观察者对象
     */
  private List<PullObserver> mObserverList = new ArrayList<>();

    /**
     * 注册观察者对象
     */
   public void  registerObserver(PullObserver pushObserver){
       if (!mObserverList.contains(pushObserver)){
           mObserverList.add(pushObserver);
       }
   }
    /**
     * 删除观察者对象
     */
    public void  unregisterObserver(PullObserver pushObserver){
            mObserverList.remove(pushObserver);
    }
    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers(){
        for(PullObserver observer : mObserverList){
            observer.update(this);
        }
    }
}
