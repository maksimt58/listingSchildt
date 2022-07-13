package com.maksim_tatarintsev.javacore.chapter14;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        Gen<String> sob = new Gen<>("Generics");

        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getOb();

        System.out.println("Value: " + d);

        int i = (Integer) raw.getOb();

    }
}
