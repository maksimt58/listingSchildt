package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOCopy {
    public static void main(String[] args) {
        try{
            Path src = Paths.get("d:/test.txt");
            Path dst = Paths.get("d:/test1.txt");

            Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
