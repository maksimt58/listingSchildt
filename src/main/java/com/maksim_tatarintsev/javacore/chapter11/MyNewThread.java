package com.maksim_tatarintsev.javacore.chapter11;

public class MyNewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    MyNewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }

        System.out.println(name + "завершен");

    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
