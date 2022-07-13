package com.maksim_tatarintsev.javacore.chapter14;

public class TwoGen <T,V>{
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    void showType(){
        System.out.println("Type T is a " + ob1.getClass().getSimpleName());
        System.out.println("Type V is a " + ob2.getClass().getSimpleName());
    }
}
