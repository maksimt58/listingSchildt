package com.maksim_tatarintsev.javacore.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelRead2 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileChannel fChan = null;
        long fsize;
        MappedByteBuffer mBuf;

        try{
            fin = new FileInputStream("d:/test.txt");
            fChan = fin.getChannel();
            fsize = fChan.size();
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0 , fsize);
            for  (int i = 0; i < fsize; i++) {
                System.out.print((char) mBuf.get());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
