package com.maksim_tatarintsev.javacore.chapter11;

public class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run(){
        int i = 0;

        while(true){
            q.put(i++);
        }
    }
}
