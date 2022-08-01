package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.Phaser;

public class MyThread4 implements Runnable{
    Phaser phaser;
    String name;

    public MyThread4(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()){
            System.out.println("Поток " + name + " начинает первую фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
