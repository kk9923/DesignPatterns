package com.kx.designpatterns.StructuralPattern.ProxyPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;
import com.kx.designpatterns.StructuralPattern.ProxyPattern.InvocationHandler.DynamicProxy;

import java.lang.reflect.Proxy;

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        // 构造真实主题类(被代理类)
        Subject realSubject = new RealSubject();
        // 构造代理类(只有真实主题类的引用)
        Subject proxySubject = new ProxySubject(realSubject);
        //  由代理类去购买电脑
        proxySubject.buyComputer();

        System.out.println("-------------------------------");
        // 构造一个动态代理
        DynamicProxy proxy = new DynamicProxy(realSubject);
        //  获取被代理类的ClassLoader
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        //  动态的构造一个代理类
        Subject dynamicProxy = (Subject) Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},proxy);
        //  由代理类去购买电脑
        dynamicProxy.buyComputer();

    }
}
