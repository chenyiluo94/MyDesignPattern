package com.example.myapplication.singlecase;

/**
 * 单例设计模式
 * 静态变量
 * 饿汉式
 * 优点：写法简单，类装载的时候就完成实例化，避免线程同步问题。
 * 线程同步：当有一个线程对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作。
 * 其它线程才能对该内存进行操作。
 * 缺点：类装在的时候就完成实例化，没有达到懒加载的效果，如果从始至终从未使用该实例，就造成了浪费。
 */
class SingleDemo01 {
    public final  static SingleDemo01 singleDemo01=new SingleDemo01();
    private SingleDemo01(){}
    public static SingleDemo01 getSingleDemo01(){
        return singleDemo01;
    }
}
