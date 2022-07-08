package com.maksim_tatarintsev.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        if( args.length != 2){
            System.out.println("Используйте 2 файла");
            return;
        }

        try{
            fis = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1]);

            do{
                i = fis.read();
                if(i != -1) fos.write(i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        finally {
            try{
                if(fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }

            try{
                if(fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
