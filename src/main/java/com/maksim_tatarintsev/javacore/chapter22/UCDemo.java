package com.maksim_tatarintsev.javacore.chapter22;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        //URL hp = new URL("https://javarush.ru");

        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();

        if (d == 0) {
            System.out.println("Data about date not founded");

        } else System.out.println("Date " + new Date(d));

        System.out.println("Type content: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("Данные о сроке действия ресурса отсутствуют");
        } else System.out.println("Срок действия истекает: " + new Date(d));

        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("Сведения о последней дате модификации отсутствуют");

        } else System.out.println("Дата последней модификации: " + new Date(d));

        long len = hpCon.getContentLengthLong();

        if (len == -1) {
            System.out.println("Длина содержимого недосткпна");
        } else System.out.println("Длина содержимого: " + len);

        if (len != 0) {
            System.out.println("=====СОДЕРЖИМОЕ=====");
            InputStream input = hpCon.getInputStream();
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else System.out.println("Содержимое недоступно");


    }
}
