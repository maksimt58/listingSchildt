package com.maksim_tatarintsev.javacore.chapter20;

public class PrintDemo {
    public static void main(String[] args) {
        System.out.println("Hижe приведены некоторые "+
                "числовые значения в разных форматах.\n");
        System.out.printf("Paзныe целочисленные форматы:");
        System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);
        System.out.println();

        System.out.printf("Фopмaт чисел с плавающей точкой "+
                "по умолчанию: %f\n",1234567.123);
        System.out.printf("Фopмaт чисел с плавающей точкой "+
                "по умолчанию: %,f\n",1234567.123);
        System.out.printf("Фopмaт чисел с плавающей точкой "+
                "по умолчанию: %,f\n",-1234567.123);
        System.out.printf("Фopмaт чисел с плавающей точкой "+
                "по умолчанию: %,(f\n",-1234567.123);
        System.out.println();
        System.out.printf("Bыpaвнивaниe положительных и "+
                " отрицательных числовых значений:\n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    }
}
