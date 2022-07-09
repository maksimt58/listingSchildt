package com.maksim_tatarintsev.javacore.chapter15;

public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if(vals[i] == v) count++;

        }
        return count;
    }
}
