package com.maksim_tatarintsev.javacore.chapter11;

public class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run(){
        while (true){
            q.get();
        }
    }
}

