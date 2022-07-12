package com.maksim_tatarintsev.javacore.chapter21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.InvalidPathException;

public class ExplicitChannelWrite2 {
    public static void main(String[] args) {
        FileOutputStream fOut =null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try{
            fOut = new FileOutputStream("d:/test1.txt");
            fChan = fOut.getChannel();
            mBuf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

            mBuf.rewind();

            fChan.write(mBuf);

        }  catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            System.exit(1);
        }finally {
            try {
                if(fChan != null) fChan.close();
                if(fOut != null) fOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
