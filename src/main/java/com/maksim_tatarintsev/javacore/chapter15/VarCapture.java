package com.maksim_tatarintsev.javacore.chapter15;

import java.util.ArrayList;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLam = n -> {
          int v = num + n;
          //num++;
          return v;
        };

        //num = 9;
    }
}
