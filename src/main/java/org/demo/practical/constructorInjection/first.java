package org.demo.practical.constructorInjection;

import java.util.ArrayList;
import java.util.List;

public class first {
    private String name;
    private int age;
    private String address;
    private List<String> ls=new ArrayList<>();

    public first(String name, int age,List<String> ls) {
        this.name = name;
        this.age = age;
        this.ls=ls;
    }

    public first(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public first(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "first{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", ls=" + ls +
                '}';
    }
}
