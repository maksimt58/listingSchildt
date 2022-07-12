package com.maksim_tatarintsev.javacore.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {


        FileInputStream fin = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;

        try {
            fin = new FileInputStream("d:/test.txt");
            fChan = fin.getChannel();

            mBuf = ByteBuffer.allocate(128);

            do{
                count = fChan.read(mBuf);
                if(count != -1){
                    mBuf.rewind();
                    for  (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }

            }
            while (count != -1);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fChan != null) fChan.close();
                if(fin != null) fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}