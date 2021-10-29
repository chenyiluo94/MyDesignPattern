package com.example.myapplication.singlecase;

/**
 * 双重检查
 * 双重加锁对多线程开发不陌生，我们进行了两次if(singleDemo==null)的检查，这样可以保证线程安全，实例化代码也只用执行一次。
 * 优点：线程安全，延迟加载，效率较高。
 */
class SingleDemo06 {
    private static volatile SingleDemo06 singleDemo06=null;
    private SingleDemo06(){}
    public static SingleDemo06 getSingleDemo06(){
        if (singleDemo06==null){
            synchronized (SingleDemo06.class){
                if (singleDemo06==null){
                    singleDemo06=new SingleDemo06();
                }
            }
        }
        return singleDemo06;
    }
}
