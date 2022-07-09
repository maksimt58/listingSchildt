package com.maksim_tatarintsev.javacore.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass2::new;

        MyClass2 mc = myClassCons.func(100);

        System.out.println(mc.getVal());
    }
}
