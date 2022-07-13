package com.maksim_tatarintsev.javacore.chapter14;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        NewGen<Integer> iob2 = new NewGen<>(99);
        NewGen<String> sob = new NewGen<>("Generics");

        if(iob2 instanceof NewGen<?>){
            System.out.println("iob2 принадлежит классу NewGen");
        }
        if(iob2 instanceof Gen<?>){
            System.out.println("iob2 принадлежит классу Gen");
        }
        System.out.println();

        if(sob instanceof NewGen<?>){
            System.out.println("sob принадлежит классу NewGen");
        }
        if(sob instanceof Gen<?>){
            System.out.println("sob принадлежит классу Gen");
        }
        System.out.println();

        if(iob instanceof NewGen<?>){
            System.out.println("iob принадлежит классу NewGen");
        }
        if(iob instanceof Gen<?>){
            System.out.println("iob принадлежит классу Gen");
        }
        System.out.println();
    }
}
