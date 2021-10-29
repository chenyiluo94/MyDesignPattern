package com.example.myapplication.singlecase;

/**
 * 懒汉式
 * 线程不安全的写法
 * 懒汉式线程不安全：写法起到了懒加载的效果，但是只能在单线程中使用。如果在多线程中，一个线程进入 if(singleDemo==null)的判断语句块，
 * 还未来得及往下执行，另一个线程也通过这个判断语句，这时就会出现多个实例。
 */
class SingleDemo03 {
    private static SingleDemo03 singleDemo03=null;
    private SingleDemo03(){}
    public static SingleDemo03 getSingleDemo03(){
        if (singleDemo03==null){
            singleDemo03=new SingleDemo03();
        }
        return singleDemo03;
    }
}
