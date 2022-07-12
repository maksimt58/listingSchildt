package com.maksim_tatarintsev.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.herbschildt.com/Articles");

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("host: " + hp.getHost());
        System.out.println("file: " + hp.getFile());
        System.out.println("Full form: " + hp.toExternalForm());




    }
}
