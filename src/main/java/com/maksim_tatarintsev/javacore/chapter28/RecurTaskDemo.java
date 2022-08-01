package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = ForkJoinPool.commonPool();

        double[] nums = new double[5000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) ((i%2) == 0 ? i : -i);
        }

        Sum2 task = new Sum2(nums,0,nums.length);

        double summation = fjp.invoke(task);

        System.out.println("Summation " + summation);
    }
}
