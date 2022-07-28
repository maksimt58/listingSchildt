package com.maksim_tatarintsev.javacore.chapter11;

public class NewThread2 extends Thread{
    NewThread2(){
        super("Demo thread");
        System.out.println("Child thread created " + this);
        start();
    }

    public void run(){
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("The child thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("The child thread is interrupted");
        }

        System.out.println("The child thread is completed");
    }
}
