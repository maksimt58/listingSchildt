package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowFileNIO {
    public static void main(String[] args) {
        int i;

        try (InputStream in = Files.newInputStream(Paths.get("d:/test1.txt"))) {
        do{
            i = in.read();
            if(i != -1) System.out.print((char) i);
        }while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
