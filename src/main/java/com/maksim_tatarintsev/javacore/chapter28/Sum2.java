package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.RecursiveTask;

public class Sum2 extends RecursiveTask<Double> {
    final int seqThreshold = 500;

    double[] data;

    int start;
    int end;

    public Sum2 (double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    protected Double compute(){
        double sum = 0;

        if((end - start) < seqThreshold){
            for (int i = start ; i < end; i++) {
                sum += data[i];
            }
        }else{
            int middle = (start + end) / 2;

            Sum2 subTaskA = new Sum2(data, start,middle);
            Sum2 subTaskB = new Sum2(data,middle,end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}
