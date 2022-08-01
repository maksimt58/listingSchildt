package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = ForkJoinPool.commonPool();

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("Часть исходной последовательности: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        //fjp.invoke(task);
        task.invoke();

        System.out.println("Часть преобразованной последовательности " +
                "(с точностью до четрыех знаков после десятичной точки): ");
        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ",nums[i]);
        }

        System.out.println();

    }
}
