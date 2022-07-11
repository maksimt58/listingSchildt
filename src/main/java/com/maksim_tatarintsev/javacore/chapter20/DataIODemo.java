package com.maksim_tatarintsev.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("d:/test.txt"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);

        }catch (FileNotFoundException e){
            System.out.println("Ошибка открытия файла: " + e);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("d:/test.txt"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println(d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
