package com.maksim_tatarintsev.javacore.chapter14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<>(88,"Generics");
        tgObj.showType();

        int v = tgObj.getOb1();
        System.out.println("v: " + v);
        System.out.println();

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
