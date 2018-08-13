package com.kx.designpatterns.SingletonPattern;

import java.io.ObjectStreamException;

/**
 * 懒汉式单例模式(线程不安全)
 *
 * 当多个线程同时调用getInstance()时, sSingleton为空，会调用多次 sSingleton = new Singleton1()
 * 则会生成多个对象。
 *
 *
 */
public class Singleton1 {
    private static Singleton1 sSingleton ;
    private Singleton1() {
    }
    public static Singleton1 getInstance() {
        if (sSingleton ==null){
            sSingleton = new Singleton1();
        }
        return sSingleton;
    }
    /**
     * 防止反序列化时生成新的对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readRedolve() throws ObjectStreamException {
        return sSingleton;
    }
}
