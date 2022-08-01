package com.maksim_tatarintsev.javacore.chapter28;

public class AtomThread implements Runnable{
    String  name;

    public AtomThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("The Thread start " + name);

        for (int i = 0; i <= 3; i++) {
            System.out.println("Thread " + name + " get: " + Shared2.ai.getAndSet(i));
        }
    }
}
