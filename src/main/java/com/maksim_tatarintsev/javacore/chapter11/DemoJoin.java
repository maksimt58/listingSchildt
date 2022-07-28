package com.maksim_tatarintsev.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("One");
        NewThread3 ob2 = new NewThread3("Two");
        NewThread3 ob3 = new NewThread3("Three");

        System.out.println("The thread One is started " + ob1.t.isAlive());
        System.out.println("The thread Two is started " + ob2.t.isAlive());
        System.out.println("The thread Three is started " + ob3.t.isAlive());

        try{
            System.out.println("Wait while the thread become completed");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("The main thread is interrupted");
        }

        System.out.println("The main thread is completed");

        System.out.println("The thread One is started " + ob1.t.isAlive());
        System.out.println("The thread Two is started " + ob2.t.isAlive());
        System.out.println("The thread Three is started " + ob3.t.isAlive());

    }
}
