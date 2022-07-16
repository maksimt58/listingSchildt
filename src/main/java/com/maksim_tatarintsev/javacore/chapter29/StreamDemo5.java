package com.maksim_tatarintsev.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Лappи","555-5555","Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джeймc","555-4444","James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mэpи","555-3333","Mary@HerbSchildt.com"));

        System.out.println("Исхожные элементы из списка myList: ");
        myList.stream().forEach(a ->
        {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });

        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach(a ->
        {
            System.out.println(a.name + " " + a.phonenum);
        });
        System.out.println();
        Stream<NamePhone> nameAndPhone2 = myList.stream().filter(a -> a.name.equals("Джeймc")).map(a -> new NamePhone(a.name, a.phonenum));
        nameAndPhone2.forEach(a ->
        {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
