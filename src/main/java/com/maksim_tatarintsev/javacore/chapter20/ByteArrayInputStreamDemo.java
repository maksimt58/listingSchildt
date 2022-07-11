package com.maksim_tatarintsev.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = tmp.getBytes(StandardCharsets.UTF_8);

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0 ,3);
    }
}
