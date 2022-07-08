package com.maksim_tatarintsev.javacore.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile3 {
    public static void main(String[] args) {
        int i;


        if (args.length != 1) {
            System.out.println("Use ShowFile");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e){
            System.out.println("I O Exception");
        }
    }
}
