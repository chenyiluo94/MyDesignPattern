package com.example.myapplication.singlecase;

/**
 * 静态内部类 线程安全
 *这种方法跟饿汉式采用了相类似的机制，但又不同。两者都是采用了类装载机制来保障初始化实例时只有一个线程。
 * 不同的是饿汉式方式是只要SingleDemo类被装载就会实例化，没有懒加载的作用，而静态内部类的方式在SingleDemo类
 * 被装载时并不会被立即实例化，而是在需要实例化时调用getInstance方法，才会装载SingleDemo的类，从而完成实例化。
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里jvm帮助我们保证线程的安全性，在类进行初始化时，别的线程时无法进入的。
 *
 * 优点：避免线程不安全，延迟加载，效率高
 */
class SingleDemo07 {
    private SingleDemo07(){}
    private static class SingleInstanDemo{
        private final static SingleDemo07 singleDemo07=new SingleDemo07();
    }
    public static SingleDemo07 getInstance(){
        return SingleInstanDemo.singleDemo07;
    }
}
