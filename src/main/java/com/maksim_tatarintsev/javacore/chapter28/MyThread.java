package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    String name;
    CountDownLatch cdl;

    public MyThread(CountDownLatch cdl, String name) {
        this.name = name;
        this.cdl = cdl;
    }

    public MyThread(CountDownLatch cdl) {
        this.cdl = cdl;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ":" + i);
            cdl.countDown();
        }
    }
}
