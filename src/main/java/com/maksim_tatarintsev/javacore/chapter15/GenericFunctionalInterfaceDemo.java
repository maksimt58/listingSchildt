package com.maksim_tatarintsev.javacore.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
          String result = "";
          int i;
          for(i = str.length()-1; i >= 0; i--){
              result += str.charAt(i);
          }
          return result;
        };

        SomeFunc<Integer> factorial = integer -> {
          int result = 1;
            for (int i = 1; i <= integer; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Лямбда: " + reverse.func("Лямбда"));
        System.out.println("Выражение: " + reverse.func("Выражение"));

        System.out.println();

        System.out.println("Факториал числа 3 равен: " + factorial.func(3));
        System.out.println("Факториал числа 5 равен: " + factorial.func(5));
    }
}
