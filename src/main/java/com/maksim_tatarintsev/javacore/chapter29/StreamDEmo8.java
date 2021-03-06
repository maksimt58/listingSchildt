package com.maksim_tatarintsev.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDEmo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("DElta");
        myList.add("Ksi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Iterator<String> itr = myStream.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
