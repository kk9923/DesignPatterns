package com.kx.designpatterns.CreatorPattern.SingletonPattern;

/**
 * 枚举单例模式
 * 线程安全，支持序列化与反序列化，不会创建多个对象
 */
public enum  Singleton5 {
    INSTANCE;
    public void doThing(){
        System.out.println(this.hashCode());
    }
}
