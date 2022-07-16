package com.maksim_tatarintsev.javacore.chapter29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Лappи","555-5555","Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джeймc","555-4444","James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mэpи","555-3333","Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера в списке Лист: ");
        for (NamePhone namePhone : npList) {
            System.out.println(namePhone.name + ":" + namePhone.phonenum);
        }

        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("Имена и номера во множестве SEt: ");
        for (NamePhone namePhone : npSet) {
            System.out.println(namePhone.name + ":" + namePhone.phonenum);
        }

        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        LinkedList<NamePhone> npLinkList = nameAndPhone.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
    }
}
