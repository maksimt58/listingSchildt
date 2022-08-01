package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(8);

        System.out.println("Start the thread execution");
        new MyThread(cdl);

        try{
            cdl.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Completion the thread execut");
    }
}
