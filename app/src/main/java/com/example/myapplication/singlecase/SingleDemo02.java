package com.example.myapplication.singlecase;

/**
 * 单例设计模式
 * 静态代码块
 * 饿汉式
 * 优点：写法简单，类装载的时候就完成实例化，避免线程同步问题。
 * 线程同步：当有一个线程对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作。
 * 其它线程才能对该内存进行操作。
 * 缺点：类装在的时候就完成实例化，没有达到懒加载的效果，如果从始至终从未使用该实例，就造成了浪费。
 */
class SingleDemo02 {
    private static SingleDemo02 singleDemo02;
    static {
        singleDemo02=new SingleDemo02();
    }
    private SingleDemo02(){}
    public static SingleDemo02 getSingleDemo02(){
        return singleDemo02;
    }
}
