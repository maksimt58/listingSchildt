package com.maksim_tatarintsev.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
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

        //while(splitStr.tryAdvance(System.out::println));

        splitStr.forEachRemaining(System.out::println);
    }
}
