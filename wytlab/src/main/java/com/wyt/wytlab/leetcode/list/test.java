package com.wyt.wytlab.leetcode.list;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
//        linkedList.get(1);            //返回2
//        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//        linkedList.get(1);            //返回3
//        linkedList.removeNthFromEnd(linkedList.getHead(),2);
//        linkedList.mytest(linkedList.getHead());
//        linkedList.mytest1();
        MyLinkedList.ListNode  head = linkedList.removeElements(linkedList.getHead(),3);

        Chaoren chaoren = new Chaoren();
        chaoren.setAge(11);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Runnable() {
            public void run() {
                System.out.println(111);
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println(222222);
            }
        });
        executorService.shutdown();
        executorService.shutdownNow();

    }
    private static synchronized void say() {
        System.out.println(111);
    }
}
