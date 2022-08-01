package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("Threads start");

        new MyThread3(phsr,"A");
        new MyThread3(phsr,"B");
        new MyThread3(phsr,"C");
        //new MyThread3(phsr,"D");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " completion");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " completion");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " completion");

        phsr.arriveAndDeregister();

        if(phsr.isTerminated()){
            System.out.println("Синхронизатор фаз завершен");
        }

    }
}
