package com.kyle.singleton;

/**
 * Created by kyle on 2017/8/22.
 * 用dubblecheck的方式解决延迟加载单利模式的多线程问题
 */
public class SingletonDoubleCheck {

    private static SingletonDoubleCheck instance = null;
    private SingletonDoubleCheck(){}
    public static SingletonDoubleCheck getInstance(){
        // 这一次判断是为了减少执行synchronized执行次数，提高效率
        if(instance == null){
            // 加上同步锁使对象不能同时被多个线程实例化
            synchronized (SingletonDoubleCheck.class){
                if(instance == null){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
