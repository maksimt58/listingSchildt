package com.maksim_tatarintsev.javacore.chapter14;

public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
