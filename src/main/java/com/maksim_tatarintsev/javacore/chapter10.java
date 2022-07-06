package com.maksim_tatarintsev.javacore;

import java.util.Random;

public class chapter10 {

    public static void main(String[] args) {
        //exc2();
        //exc3();
        //exc4();
        //exc5();
        //exc6();
        //exc7();
        //exc8();
        //exc9();
        //exc10();
        exc11();
    }

    /*****************Exc2******************/
    public static void exc2() {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора catch");
    }

    /*****************Exc3******************/
    public static void exc3() {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль");
                System.out.println("Исключение: " + e);
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }

    /*****************Exc4******************/
    public static void exc4() {
        try {
            int a = 0;
            System.out.println("a: " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }
        /*catch (Exception e){
            System.out.println(e);
        }*/ catch (ArithmeticException e) {
            System.out.println("Деление на нуль" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }
        System.out.println("After try/catch");
    }

    /*****************Exc5******************/
    public static void exc5() {
        try {
            int a = 2;
            int b = 42 / a;
            System.out.println("a: " + a);
            try {
                if (a == 1) a = a / (a - a);
                if (a == 2) {
                    int[] c = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль " + e);
        }
    }

    /*****************Exc6 with method nesttry()******************/
    public static void exc6() {
        try {
            int a = 2;
            int b = 42 / a;
            System.out.println("a: " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль " + e);
        }
    }

    public static void nestTry(int a) {
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int[] c = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e);
        }
    }

    /*****************Exc7 with method demoproc()******************/
    public static void exc7() {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват " + e);
        }
    }

    public static void demoproc() {
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода демопрок");
            throw e;
        }
    }

    /*****************Exc8 with method throwOne()******************/
    public static void exc8() {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }

    public static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne");
        throw new IllegalAccessException("Демонстрация");
    }

    /*****************Exc9 with finally******************/
    public static void exc9() {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " + e);
        }

        procB();
        procC();
    }

    public static void procA() {
        try {
            System.out.println("В теле метода procA");
            throw new RuntimeException("Демонстрация");
        } finally {
            System.out.println("Блок finally в методе procA");
        }
    }

    public static void procB() {
        try {
            System.out.println("В теле метода procB");
            return;
        } finally {
            System.out.println("Блок finally в методе procB");
        }
    }

    public static void procC() {
        try {
            System.out.println("В теле метода procC");
        } finally {
            System.out.println("Блок finally в методе procC");
        }
    }

    /*****************Exc10 Цепочки исключений******************/
    public static void exc10() {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("перехвачено исключение: " + e);
            System.out.println("Первопричина: " + e.getCause());
        }
    }

    static void demoProc() {
        NullPointerException e = new NullPointerException("top level");
        e.initCause(new ArithmeticException("reason"));
        throw e;
    }

    /*****************Exc11 Многократный перехват******************/
    public static void exc11() {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};
        try{
            //int result = a / b;
            vals[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("перехвачено исключение: " + e);
        }
        System.out.println("После многократного перехвата");
    }

}
