package com.maksim_tatarintsev.javacore.chapter13;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.*;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("При заданной длине сторон " + side1 + " и " + side2 + " Гипотенуза равна " + hypot);
        out.println("Импортировали стандартный поток вывода System.out");
    }
}
