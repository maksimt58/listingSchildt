package com.maksim_tatarintsev.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try(FileInputStream f = new FileInputStream("d:/test.txt")){
            System.out.println("SIZE: " + (size = f.available()));

            int n = size / 40;

            System.out.println("Первые " + n + " байтов, прочитанных из файла по очереди методом read()");

            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\nВсе еще доступно: " + f.available());

            System.out.println("чтение следущих " + n + " байтов методом read(b[])");

            byte[] b = new byte[n];

            if(f.read(b) != n) {
                System.err.println("Нельзя прочитать " + n + "ьайтов");
            }

            System.out.println(new String(b,0,n));
            System.out.println("Все еще доступно: " + f.available());

            System.out.println("пропустить половину оставшихся байтов методом skip() " + f.skip(size/2));

            System.out.println("Все еще доступно: " + f.available());

            System.out.println("Чтение " + n/2 + "байтов, размещенных в конце массива");

            if(f.read(b, n/2, n/2) != n/2){
                System.err.println("Нельзя прочитать " + n/2 + "байтов");
            }
            System.out.println(new String(b,0,b.length));
            System.out.println("Все еще доступно: " + f.available());


        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
