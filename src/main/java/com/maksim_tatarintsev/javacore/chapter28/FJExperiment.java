package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

//        if(args.length != 2){
//            System.out.println("Использование: параллелизм порог");
//            return;
//        }

        pLevel = 3;
        threshold = 1000;

        long beginT, endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task = new Transform(nums, 0, nums.length, threshold);

        beginT = System.nanoTime();

        fjp.invoke(task);

        endT = System.nanoTime();

        System.out.println("Lavel parall: " + pLevel);
        System.out.println("Порог обработки " + threshold);
        System.out.println("Истекшее время: " + (endT-beginT) + " nano sec");
        System.out.println("Доступны процессоры: " + Runtime.getRuntime().availableProcessors());
        System.out.println();
    }
}
