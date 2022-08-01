package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{
    ReentrantLock lock;
    String name;

    public LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Поток " + name + "ЛЖИДАЕТ БЛОКИРОВКИ СЧЕТЧИКА");
            lock.lock();
            System.out.println("Поток " + name + "блокирует счетчик");
            Shared.count++;
            System.out.println("Поток " + name + ":" + Shared.count);
            System.out.println("Поток " + name + "ожидает");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            System.out.println("Поток " + name + "разблокирует счетчик");
            lock.unlock();
        }
    }
}
