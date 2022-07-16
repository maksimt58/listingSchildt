package com.maksim_tatarintsev.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("DElta");
        myList.add("Ksi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitStr = myStream.spliterator();

        Spliterator<String> splitStr2 = splitStr.trySplit();

        if(splitStr2 != null){
            System.out.println("splitStr2: ");
            splitStr2.forEachRemaining(System.out::println);
        }

        System.out.println("splitSTr: ");
        splitStr.forEachRemaining(System.out::println);
    }
}
