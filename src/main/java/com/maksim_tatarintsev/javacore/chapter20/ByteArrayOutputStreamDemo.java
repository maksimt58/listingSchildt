package com.maksim_tatarintsev.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();

        String s = "This data need to enter in array";
        byte[] buf = s.getBytes();

        try{
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error write buffer");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");

        byte[] b = f.toByteArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }

        System.out.println("\nВ поток типа OutputStream");

        try(FileOutputStream f2 = new FileOutputStream("d:/test.txt")){
            f.writeTo(f2);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }

        System.out.println("Установка в исходное состояние");

        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }

        System.out.println(f.toString());
    }
}
