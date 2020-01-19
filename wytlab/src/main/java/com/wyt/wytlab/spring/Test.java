package com.wyt.wytlab.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-bean.xml");
        Red red = (Red) context.getBean("red");
        red.f();
    }
}
