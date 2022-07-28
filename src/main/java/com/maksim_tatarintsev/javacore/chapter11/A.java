package com.maksim_tatarintsev.javacore.chapter11;

public class A {
    synchronized  void foo(B b){
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод А.foo()");

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("The class A is interrupted");
        }

        System.out.println(name + " пытается вызвать метод В.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("В методе A.last()");
    }
}
