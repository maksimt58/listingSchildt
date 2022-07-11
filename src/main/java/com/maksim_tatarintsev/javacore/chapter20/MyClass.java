package com.maksim_tatarintsev.javacore.chapter20;

import java.io.Serializable;

public class MyClass implements Serializable {
    String s;
    int i;
    transient double d;

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
}
