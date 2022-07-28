package com.maksim_tatarintsev.javacore.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("The parent thread: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("The parent thread is interrupted");
        }

        System.out.println("The parent thread is completed");
    }

}
