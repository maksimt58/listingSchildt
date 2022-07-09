package com.maksim_tatarintsev.javacore.chapter15;

public class MyClass3<T> {
    private T val;

    public MyClass3(T val) {
        this.val = val;
    }

    public MyClass3() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
