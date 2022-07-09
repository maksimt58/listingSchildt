package com.maksim_tatarintsev.javacore.chapter15;

public class ConstructorRefDemo3 {

    static <R,T> R myClassFactory(MyFuncInter<R,T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncInter<MyClassGeneric<Double>, Double> meClassCons = MyClassGeneric::new;

        MyClassGeneric<Double> mc = myClassFactory(meClassCons, 100.1);

        System.out.println(mc.getVal());

        MyFuncInter<MyClassGeneric2, String> meClassCons2 = MyClassGeneric2::new;

        MyClassGeneric2 mc2 = myClassFactory(meClassCons2, "Lambda");

        System.out.println(mc2.getStr());
    }
}
