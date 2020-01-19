package com.wyt.wytlab.spring;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanDemo implements FactoryBean<Red> {
    public Red getObject() throws Exception {
        return  new Red();
    }

    public Class<?> getObjectType() {
        return Red.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
