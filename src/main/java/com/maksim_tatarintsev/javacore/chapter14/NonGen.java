package com.maksim_tatarintsev.javacore.chapter14;

public class NonGen {
    Object ob;
    int num;

    public NonGen(Object ob) {
        this.ob = ob;
    }

    public NonGen(int num) {
        this.num = num;
    }

    public Object getOb() {
        return ob;
    }

    int getnum(){
        return num;
    }

    void showType(){
        System.out.println("Type is a " + ob.getClass().getSimpleName());
    }
}
