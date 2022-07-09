package com.maksim_tatarintsev.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10,2)) System.out.println("число 2 является множителем числа 10");
        if(!isFactor.test(10,3)) System.out.println("число 3 не является множителем числа 10");
    }
}
