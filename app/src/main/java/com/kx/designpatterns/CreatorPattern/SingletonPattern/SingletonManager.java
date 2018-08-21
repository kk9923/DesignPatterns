package com.kx.designpatterns.CreatorPattern.SingletonPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/8/13.
 * 使用容器类实现的单例模式
 */
public class SingletonManager {
    private static  Map<String,Object> mObjectMap = new HashMap<>();
    public static void  registerService (String key,Object instance){
        if (!mObjectMap.containsKey(key)){
            mObjectMap.put(key,instance);
        }
    }
    public static Object getService(String key){
        return mObjectMap.get(key);
    }
}
