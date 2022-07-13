package com.maksim_tatarintsev.javacore.chapter14;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String,Integer> x = new Gen2<>("Value = ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());

    }
}
