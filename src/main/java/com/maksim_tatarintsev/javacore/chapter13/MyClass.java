package com.maksim_tatarintsev.javacore.chapter13;

public class MyClass {
    int a, b;

    public MyClass() {
        this(0);
//        a = 0;
//        b = 0;
    }

    public MyClass(int i) {
        this(i,i);
//        a = i;
//        b = i;
    }

    public MyClass(int i, int j) {
        a = i;
        b = j;
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(8);
        MyClass mc1 = new MyClass();
    }

}
