package com.maksim_tatarintsev.javacore.chapter15;

import java.util.Locale;

public class LambdasAsArgumentsDemo {
    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность JAVA";
        String outStr;
        System.out.println("Это исходная строка " + inStr);

        outStr = stringOp(str -> str.toUpperCase(Locale.ROOT), inStr);
        System.out.println("Строка прописными буквами " + outStr);

        outStr = stringOp(str -> {
          String result = "";
          int i;
            for (i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' ') result += str.charAt(i);
            }
            return result;
        }, inStr);

        System.out.println("Строка без пробелов " + outStr);

        StringFunc reverse = str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Это обращенная строка " + stringOp(reverse, inStr));
    }

    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
}
