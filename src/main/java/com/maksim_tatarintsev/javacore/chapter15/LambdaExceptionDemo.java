package com.maksim_tatarintsev.javacore.chapter15;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayExeption{
        double[] values = {1.0, 2.0, 3.0, 4.0};

        DoubleNumericArrayFunc average = n -> {
          double sum = 0;
          if(n.length == 0) throw new EmptyArrayExeption();

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum/ n.length;
        };

        System.out.println("Average: " + average.func(values));
        System.out.println("Average: " + average.func(new double[0]));
    }
}
