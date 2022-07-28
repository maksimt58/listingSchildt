package com.maksim_tatarintsev.javacore.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("The main thread is interrupted");
        }
        System.out.println("The main thread is completed");
    }
}
