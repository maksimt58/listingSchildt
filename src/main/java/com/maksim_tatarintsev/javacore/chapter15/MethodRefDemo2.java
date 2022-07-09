package com.maksim_tatarintsev.javacore.chapter15;

public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность JAVA";
        String outStr;

        MyStringOps2 mso = new MyStringOps2();

        outStr = stringOp(mso::strReverse, inStr);
        System.out.println("Это обращенная строка " + outStr);
    }
}
