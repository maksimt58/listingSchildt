package com.maksim_tatarintsev.javacore.chapter11;

public class Callme {
     void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
