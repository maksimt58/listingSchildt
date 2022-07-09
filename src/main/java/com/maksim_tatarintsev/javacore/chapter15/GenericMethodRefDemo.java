package com.maksim_tatarintsev.javacore.chapter15;

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] str = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);

        System.out.println("Массив vals содержит " + count + " числа четыре");

        count = myOp(MyArrayOps::countMatching, str, "Two");

        System.out.println("Массив str содержит " + count + " числа два");
    }
}
