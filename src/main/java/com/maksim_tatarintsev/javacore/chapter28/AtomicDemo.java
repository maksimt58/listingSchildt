package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
