package com.maksim_tatarintsev.javacore.chapter14;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Average value iob: " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Average value dob: " + w);

        Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("Average value fob: " + x);

        System.out.println("Средние значение iob и dob");

        if(iob.sameAvg(dob)) System.out.println("равны");
        else System.out.println("отличаются");

        System.out.println("Средние значение iob и fob");

        if(iob.sameAvg(fob)) System.out.println("равны");
        else System.out.println("отличаются");

    }
}
