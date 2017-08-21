package com.kyle.singleton;

/**
 * Created by kyle on 2017/8/22.
 * 这也是一种线程安全的单例模式
 */
public class Singletion {

    private static class InnerSingletion {
        private static Singletion single = new Singletion();
    }

    public static Singletion getInstance(){
        return InnerSingletion.single;
    }

}

