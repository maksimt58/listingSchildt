package com.maksim_tatarintsev.javacore.chapter15;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность JAVA";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Это обращенная строка " + outStr);
    }
}
