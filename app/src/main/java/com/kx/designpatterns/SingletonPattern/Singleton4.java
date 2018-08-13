package com.kx.designpatterns.SingletonPattern;

import java.io.ObjectStreamException;

/**
 * 双重检查锁单例模式
 *
 *    sSingleton = new Singleton()这句，这并非是一个原子操作，JVM 中这句话大概做了下面 3 件事情:
 *
 *    1.给 instance 分配内存
 *    2.调用 Singleton 的构造函数来初始化成员变量
 *    3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）。
 *    由于Java编译器允许处理器乱序执行，所以上面的第二步第三步的执行顺序没法得到保证。执行顺序可能是1-2-3也可能是1-3-2。
 *    当A线程执行顺序是1-3-2的时候，如果执行到了1-3，第2步还没执行的时候,这时 instance 已经是非 null 了(但却没有初始化),
 *    如果此时B线程访问getInstance()方法,会直接返回instance(非null，但没有初始化),然后在B线程使用该instance,则会报错。
 *
 */
public class Singleton4 {
    private static  Singleton4 sSingleton  = null;
    private Singleton4() {
    }
    public static Singleton4 getInstance() {
        if (sSingleton ==null){
            synchronized (Singleton4.class){
                if (sSingleton==null){
                    sSingleton = new Singleton4();
                }
            }
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
