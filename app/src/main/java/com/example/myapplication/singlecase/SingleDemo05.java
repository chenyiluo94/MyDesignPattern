package com.example.myapplication.singlecase;

/**
 *懒汉模式 线程安全 同步代码块
 *优点：解决同步方法效率过低，改成同步代码块。
 * 缺点：但是这种同步并不能起到线程同步的作用。与线程不安全一样，一个线程进入到if(singleDemo==null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过这个判断语句，产生多个实例.
 */
class SingleDemo05 {
    private static SingleDemo05 singleDemo05=null;
    private SingleDemo05(){}
    public static SingleDemo05 getSingleDemo05(){
        if (singleDemo05==null){
            synchronized (SingleDemo05.class){
                singleDemo05=new SingleDemo05();
            }
        }
        return singleDemo05;
    }
}
