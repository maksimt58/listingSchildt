package com.maksim_tatarintsev.javacore.chapter28;

import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 1000;

    double[] data;

    int start;
    int end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    protected void compute(){
        if((end - start) < seqThreshold){
            for (int i = start ; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }else{
            int middle = (start + end) / 2;

            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}
