package com.maksim_tatarintsev.javacore.chapter22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpConHttp = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: " + hpConHttp.getRequestMethod());

        System.out.println("Код ответа: " + hpConHttp.getResponseCode());
        System.out.println("Ответное сообщение: " + hpConHttp.getResponseMessage());

        Map<String, List<String >> hdrMap = hpConHttp.getHeaderFields();

        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nДалее следует заголовок: ");

        for (String k : hdrField) {
            System.out.println("Ключ: " + k + "Значение: " + hdrMap.get(k));
        }


    }
}
