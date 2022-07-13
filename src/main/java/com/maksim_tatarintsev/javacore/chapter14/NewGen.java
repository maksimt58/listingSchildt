package com.maksim_tatarintsev.javacore.chapter14;

public class NewGen<T> extends Gen<T> {
    public NewGen(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.println("Метод getOb() из класса NewGen: ");
        return ob;
    }
}
