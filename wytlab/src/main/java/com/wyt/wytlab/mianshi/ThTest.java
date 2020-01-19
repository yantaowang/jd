package com.wyt.wytlab.mianshi;

import org.apache.commons.collections.list.SynchronizedList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThTest {
    public static void main(String[] args) {
        Set<String> list = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
