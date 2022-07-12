package com.maksim_tatarintsev.javacore.chapter21;

import javax.naming.directory.BasicAttributes;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("d:/example/test.txt");

        System.out.println("File name: " + filePath.getName(1));
        System.out.println("Path to file: " + filePath);
        System.out.println("Absolute Path to file: " + filePath.toAbsolutePath());

        System.out.println("Parent catalog: " + filePath.getParent());

        if(Files.exists(filePath)) System.out.println("File exists");
        else System.out.println("File not exists");

        try{
            if(Files.isHidden(filePath)) System.out.println("File is hidden");
            else System.out.println("File is not hidden");
        } catch (IOException e) {
            e.printStackTrace();
        }

       if(Files.isWritable(filePath)) System.out.println("File is available for write");
       if(Files.isReadable(filePath)) System.out.println("File is available for read");

       try{
           BasicFileAttributes attribs = Files.readAttributes(filePath, BasicFileAttributes.class);
           if(attribs.isDirectory()) System.out.println("This is a catalog");
           else System.out.println("This is not  a catalog");

           if(attribs.isRegularFile()) System.out.println("This is a file");
           else System.out.println("This is not  a file");

           if(attribs.isSymbolicLink()) System.out.println("This is a symbolic link");
           else System.out.println("This is not a symbolic link");

           System.out.println("Time last modify: " + attribs.lastModifiedTime());

           System.out.println("File size: " + attribs.size());



       } catch (IOException e) {
           e.printStackTrace();
       }


    }
}
