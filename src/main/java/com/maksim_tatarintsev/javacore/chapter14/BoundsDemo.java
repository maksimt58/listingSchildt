package com.maksim_tatarintsev.javacore.chapter14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Average value iob: " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Average value dob: " + w);

        /*String snums[] = {"1","2","3","4","5"};
        Stats<String> sob = new Stats<>(snums);
        double s = sob.average();
        System.out.println("Average value iob: " + s);*/

    }
}
