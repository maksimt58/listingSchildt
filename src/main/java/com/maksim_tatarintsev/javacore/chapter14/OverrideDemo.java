package com.maksim_tatarintsev.javacore.chapter14;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        NewGen<Integer> iob2 = new NewGen<>(99);
        NewGen<String> sob = new NewGen<>("Generics");

        System.out.println(iob.getOb());
        System.out.println(iob2.getOb());
        System.out.println(sob.getOb());
        System.out.println();

    }
}
