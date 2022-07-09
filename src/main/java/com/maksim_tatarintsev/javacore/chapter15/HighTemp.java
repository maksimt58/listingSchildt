package com.maksim_tatarintsev.javacore.chapter15;

public class HighTemp {
    private int hTemh;

    HighTemp(int ht){
        hTemh = ht;
    }
    boolean sameTemp(HighTemp ht2){
        return hTemh == ht2.hTemh;
    }

    boolean lessThanTemp(HighTemp ht2){
        return hTemh < ht2.hTemh;
    }
}
