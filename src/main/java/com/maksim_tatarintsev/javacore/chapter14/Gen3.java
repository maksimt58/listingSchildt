package com.maksim_tatarintsev.javacore.chapter14;

public class Gen3<T> extends NonGen {
    T ob;

    public Gen3(T o, int ob) {
        super(ob);
        this.ob = o;
    }

    @Override
    public T getOb() {
        return ob;
    }
}
