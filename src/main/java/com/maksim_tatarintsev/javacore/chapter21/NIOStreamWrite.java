package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fOut = Files.newOutputStream(Paths.get("d:/test1.txt"))) {
            for (int i = 0; i < 26; i++) {
                fOut.write((byte) ('A' + i));
            }
        }catch (InvalidPathException e){
            System.out.println("Ошибка указания пути: " + e);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
