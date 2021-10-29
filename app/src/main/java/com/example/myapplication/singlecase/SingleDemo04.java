package com.example.myapplication.singlecase;

/**
 * 懒汉式
 * 线程安全 同步方法
 * 优点：解决懒汉模式线程不安全的问题，做了线程同步就可以了，于是就对getInstance()方法进行了线程同步，
 * 缺点：效率太低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步，其实这个方法只要执行一次就够了。
 * 后面想获得该类实例，直接return就可以。方法进行同步效率太低要改进。
 */
class SingleDemo04 {
    private static  SingleDemo04 singleDemo04=null;
    private SingleDemo04(){}
    public static synchronized SingleDemo04 getSingleDemo04(){
        if (singleDemo04==null){
            singleDemo04=new SingleDemo04();
        }
        return singleDemo04;
    }
}
