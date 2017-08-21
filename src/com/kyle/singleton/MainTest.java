package com.kyle.singleton;

/**
 * Created by kyle on 2017/8/21.
 */
public class MainTest {

    public static void main(String[] args) {

        // 测试延迟加载在单线程中的可用性
        SingletonLazy inst1 = SingletonLazy.getInstance();
        System.out.println(inst1.hashCode());
        SingletonLazy inst2 = SingletonLazy.getInstance();
        System.out.println(inst2.hashCode());
        SingletonLazy inst3 = SingletonLazy.getInstance();
        System.out.println(inst3.hashCode());
        SingletonLazy inst4 = SingletonLazy.getInstance();
        System.out.println(inst4.hashCode());

        // 测试多线程下双重check的延迟加载模式的可用性
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--"+SingletonDoubleCheck.getInstance().hashCode());
            }
        },"t1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--"+SingletonDoubleCheck.getInstance().hashCode());
            }
        },"t2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--"+SingletonDoubleCheck.getInstance().hashCode());
            }
        },"t3").start();
    }
}
