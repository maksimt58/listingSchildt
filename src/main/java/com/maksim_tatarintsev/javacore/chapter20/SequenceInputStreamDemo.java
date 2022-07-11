package com.maksim_tatarintsev.javacore.chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files= new Vector<>();

        files.addElement("d:/test.txt");
        files.addElement("d:/test1.txt");
        files.addElement("d:/test.properties");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);


        try(InputStream input = new SequenceInputStream(ise)){
            while ((c = input.read()) != -1) System.out.print((char) c);
        }catch (NullPointerException e){
            System.out.println("Ошибка открытия файла: " + e);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
