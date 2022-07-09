package com.maksim_tatarintsev.javacore.chapter15;

public class MyClassGeneric<T> {
    private T val;

    public T getVal() {
        return val;
    }

    public MyClassGeneric() {
        val = null;
    }

    public MyClassGeneric(T val) {
        this.val = val;
    }
}
