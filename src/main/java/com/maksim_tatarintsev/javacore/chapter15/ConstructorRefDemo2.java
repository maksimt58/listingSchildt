package com.maksim_tatarintsev.javacore.chapter15;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass3<Integer>::new;

        MyClass3<Integer> mc = myClassCons.func(95);

        System.out.println(mc.getVal());
    }


}
