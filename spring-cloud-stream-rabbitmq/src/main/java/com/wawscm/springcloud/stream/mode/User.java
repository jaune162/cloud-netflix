/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.stream.mode;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
public class User {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", age:" + this.age;
    }
}
