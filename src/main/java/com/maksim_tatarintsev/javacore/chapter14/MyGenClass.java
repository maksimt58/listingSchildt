package com.maksim_tatarintsev.javacore.chapter14;

public class MyGenClass <T extends Comparable<T>,V>{
    T ob1;
    V ob2;

    public void set(T o) {
       ob1 = o;
    }

    public void set(V o) {
        ob2 = o;
    }

    static <R extends Number> int show(MyGenClass<?, R> i){
        return 1;
    }
}
