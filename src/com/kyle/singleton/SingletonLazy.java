package com.kyle.singleton;

/**
 * Created by kyle on 2017/8/21.
 * 普通延迟加载的方式实现单利模式
 */
public class SingletonLazy {
    private static SingletonLazy instance ;
    private SingletonLazy(){}

    public static SingletonLazy getInstance() {

        // 如果是多线程的场合这段代码会出现问题有可能new出多个对象
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}

