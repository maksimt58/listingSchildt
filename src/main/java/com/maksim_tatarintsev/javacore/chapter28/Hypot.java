package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.Callable;

public class Hypot implements Callable<Double> {
    double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
}
