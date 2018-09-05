package com.kx.designpatterns.BehavioralPattern.ObserverPattern.push;

import java.util.ArrayList;
import java.util.List;

/**
 *  拉模型 --  抽象主题角色 ---   被观察者 ( Observable )
 */
public abstract  class PushSubject {

    /**
     * 用来保存注册的观察者对象
     */
  private List<PushObserver> mObserverList = new ArrayList<>();

    /**
     * 注册观察者对象
     */
   public void  registerObserver(PushObserver pushObserver){
       if (!mObserverList.contains(pushObserver)){
           mObserverList.add(pushObserver);
       }
   }
    /**
     * 删除观察者对象
     */
    public void  unregisterObserver(PushObserver pushObserver){
            mObserverList.remove(pushObserver);
    }
    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers(String arg){
        for(PushObserver observer : mObserverList){
            observer.update(arg);
        }
    }
}
