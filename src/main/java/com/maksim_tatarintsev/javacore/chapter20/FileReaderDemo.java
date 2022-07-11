package com.maksim_tatarintsev.javacore.chapter20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("d:/test.txt")) {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
