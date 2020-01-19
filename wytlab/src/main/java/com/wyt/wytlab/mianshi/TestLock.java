package com.wyt.wytlab.mianshi;

public class TestLock {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        new Thread(()->{
            phone.sendSms();
        },"t1").start();
        new Thread(()->{
            phone.sendSms();
        },"t2").start();
        Thread.sleep(1000);

        new Thread(phone).start();
        new Thread(phone).start();
    }
}
