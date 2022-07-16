package com.maksim_tatarintsev.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        productObj.ifPresent(n -> {
            System.out.println("Произведение в виде объекта типа Optional: " + productObj.get());
        });

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение в виде значения типа int: " + product);

        int evenProduct = myList.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;
        });

        System.out.println("Произведение четных значений " + evenProduct);

        Optional<Integer> productObj2 = myList.parallelStream().reduce((a, b) -> a * b);
        productObj2.ifPresent(n -> {
            System.out.println("Произведение parall в виде объекта типа Optional: " + productObj2.get());
        });

        int product2 = myList.parallelStream().reduce(2, (a, b) -> a * b,
                                                                (a, b) -> a * b);
        System.out.println("Произведение в виде значения типа int: " + product2);
    }
}
