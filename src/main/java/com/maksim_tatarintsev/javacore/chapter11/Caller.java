package com.maksim_tatarintsev.javacore.chapter11;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String msg) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        synchronized (target) {
            target.call(msg);
        }
    }
}
