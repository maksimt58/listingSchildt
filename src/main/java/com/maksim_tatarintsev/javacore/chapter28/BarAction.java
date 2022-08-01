package com.maksim_tatarintsev.javacore.chapter28;

public class BarAction implements Runnable{

    @Override
    public void run() {
        System.out.println("Барьер достигнут");
    }
}
