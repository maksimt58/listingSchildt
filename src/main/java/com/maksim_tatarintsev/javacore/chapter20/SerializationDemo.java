package com.maksim_tatarintsev.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("d:/test.txt"))){
            com.maksim_tatarintsev.javacore.chapter20.MyClass object1 = new com.maksim_tatarintsev.javacore.chapter20.MyClass("Hello", -7, 2.7e10);
            System.out.println("objet1: " + object1);
            objOStrm.writeObject(object1);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e);
        }

        try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("d:/test.txt"))){
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("objet2: " + object2);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка при десериализации: " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
