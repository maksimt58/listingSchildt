package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        /*Path filePath = null;

        try{
            filePath = Paths.get("d:/test.txt");
        } catch (Exception e) {
            System.out.println("Path error: " + e);
        }*/

        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("d:/test.txt"))){ //Получаем канал к файлу
            ByteBuffer mBuf = ByteBuffer.allocate(128); //выделдение памяти под буфер
            do{
                count = fChan.read(mBuf); //Читаем данные из файла в буфер
                if(count != -1) { // Прекращаем чтение по достижению конца файла

                    mBuf.rewind(); //подготовить буфер к чтению из него данных

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            }while (count != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
