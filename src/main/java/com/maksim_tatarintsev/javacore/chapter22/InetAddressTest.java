package com.maksim_tatarintsev.javacore.chapter22;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.herbschildt.com");
        System.out.println(address);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com");

        System.out.println(Arrays.toString(sw));

        for (InetAddress inetAddress : sw) {
            System.out.println(Arrays.toString(inetAddress.getAddress()));
        }

    }
}
