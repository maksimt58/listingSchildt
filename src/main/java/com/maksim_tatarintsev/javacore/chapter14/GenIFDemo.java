package com.maksim_tatarintsev.javacore.chapter14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3,6,2,8,6};
        Character[] charAr = {'b','r','p','w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(charAr);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in charAr: " + cob.max());
        System.out.println("Min value in charAr: " + cob.min());
    }
}
