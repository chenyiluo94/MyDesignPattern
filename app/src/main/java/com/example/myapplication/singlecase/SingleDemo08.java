package com.example.myapplication.singlecase;

/**
 * 枚举
 * 优点：不仅能避免多线程同步问题，还能防止反序列化重新创建新的对象。
 */
public enum SingleDemo08{
    INSTANCE;
    public void doSomething(){
        //具体实例实现的方法
    }
}
