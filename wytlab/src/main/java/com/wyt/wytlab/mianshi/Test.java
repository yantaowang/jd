package com.wyt.wytlab.mianshi;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    myThread.addPlus();
                    myThread.addAtomic();
                }
            }).start();
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + myThread.number);
        System.out.println(Thread.currentThread().getName() + myThread.n);
    }
//    public static void g() {
//        MyThread myThread = new MyThread();
//        for (int i = 0; i < 20; i++) {
//            new Thread(()->{
//                myThread.addPlus();
//            }).start();
//        }
//
//    }
    public static void f(){
        MyThread myThread = new MyThread();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + myThread.number);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myThread.add();
            System.out.println(Thread.currentThread().getName() + myThread.number);
        },"AAA").start();
        while (myThread.number == 0) {

        }
        System.out.println(Thread.currentThread().getName() + myThread.number);
    }
}
