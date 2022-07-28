package com.maksim_tatarintsev.javacore.chapter11;

public class SuspendResume {
    public static void main(String[] args) {
        MyNewThread ob1 = new MyNewThread("One");
        MyNewThread ob2 = new MyNewThread("Two");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока Один");
            ob2.mysuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Два");
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        try{
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
