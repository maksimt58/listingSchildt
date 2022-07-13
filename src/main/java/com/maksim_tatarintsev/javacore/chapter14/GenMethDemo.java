package com.maksim_tatarintsev.javacore.chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIN(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};

        if(isIN(2, nums)) System.out.println("Число 2 содержится в массиве nums");
        if(!isIN(7, nums)) System.out.println("Число 7 не содержится в массиве nums");

        System.out.println();

        String[] str = {"One", "Two", "three", "four"};
        if(isIN("Two", str)) System.out.println("Two содержится в массиве nums");
        if(!isIN("Seven", str)) System.out.println("Seven не содержится в массиве nums");

        
    }
}
