package com.maksim_tatarintsev.javacore.chapter28;

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser myPhaser = new MyPhaser(1, 4);

        System.out.println("Start threads");

        new MyThread4(myPhaser,"A");
        new MyThread4(myPhaser,"B");
        new MyThread4(myPhaser,"C");

        while (!myPhaser.isTerminated()){
            myPhaser.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}
