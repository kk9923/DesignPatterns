package com.kx.designpatterns.CreatorPattern.SingletonPattern;

import java.io.ObjectStreamException;

/**
 * 饿汉式单例模式(线程安全)
 *
 *    当类被加载的时候即创建单例对象，即使没有调用 getInstance()方法，
 *    造成了不必要的内存开销(如果单例对象所占资源较大，则消耗过多的内存)
 */
public class Singleton3 {
    private static final Singleton3 sSingleton  = new Singleton3();
    private Singleton3() {
    }
    public static  Singleton3 getInstance() {
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
