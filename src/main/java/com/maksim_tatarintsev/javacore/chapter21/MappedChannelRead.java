package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("d:/test.txt"))){
            long size = fChan.size(); //получаем размер файла

            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0,size); //сопоставляем файл с буфером

            for (int i = 0; i < size; i++) {
                System.out.print((char) mBuf.get());
            }
            System.out.println();

        }catch (InvalidPathException e){
            System.out.println("Ошибка указания пути: " + e);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
