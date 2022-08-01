package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Start threads");

        new MyThread2(cb, "A");
        new MyThread2(cb, "B");
        new MyThread2(cb, "C");
        new MyThread2(cb, "x");
        new MyThread2(cb, "y");
        new MyThread2(cb, "z");
    }
}
