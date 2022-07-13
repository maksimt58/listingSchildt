package com.maksim_tatarintsev.javacore.chapter14;

public class Gen<T> {
     T ob;

     public Gen(T ob) {
          this.ob = ob;
     }

     public T getOb() {
          System.out.println("Метод getOb() из класса Gen: ");
          return ob;
     }

     void showType(){
          System.out.println("Type T is a " + ob.getClass().getSimpleName());
     }
}
