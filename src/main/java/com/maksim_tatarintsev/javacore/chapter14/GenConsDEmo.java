package com.maksim_tatarintsev.javacore.chapter14;

public class GenConsDEmo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        //GenCons test3 = new GenCons("123.5F");

        test.showVal();
        test2.showVal();
    }
}
