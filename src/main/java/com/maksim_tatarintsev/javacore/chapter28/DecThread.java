package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class DecThread  implements Runnable{
    String  name;
    Semaphore sem;

    public DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run(){
        System.out.println("The thread start " + name);
        try {
            System.out.println("Thread " + name + " waiting the permit");
            sem.acquire();
            System.out.println("Thread " + name + " get the permit");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }

        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Thread " + name + " releases the permission");
        sem.release();
    }
}
