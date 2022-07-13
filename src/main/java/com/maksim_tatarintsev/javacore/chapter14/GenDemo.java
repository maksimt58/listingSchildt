package com.maksim_tatarintsev.javacore.chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> obInt;

        obInt = new Gen<Integer>(88);

        obInt.showType();

        int v = obInt.getOb();
        System.out.println("v: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Test generics");

        strOb.showType();

        String str = strOb.getOb();

        System.out.println("value: " + str);
    }
}
