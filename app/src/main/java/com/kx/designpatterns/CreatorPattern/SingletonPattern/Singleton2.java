package com.kx.designpatterns.CreatorPattern.SingletonPattern;

import java.io.ObjectStreamException;

/**
 * 懒汉式单例模式(线程安全)
 *
 * 添加  synchronized  关键字后，getInstance()方法  每次只有一个线程可以访问，造成了不必要的同步开销
 *
 */
public class Singleton2 {
    private static Singleton2 sSingleton ;
    private Singleton2() {
    }
    public static synchronized Singleton2 getInstance() {
        if (sSingleton ==null){
            sSingleton = new Singleton2();
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
