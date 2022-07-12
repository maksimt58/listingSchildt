package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList2 {
    public static void main(String[] args) {
        String dirName = "D:\\IdeaProjects";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                if(Files.isWritable(entry)) return true;
                return false;
            }
        };

        try(DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirName), how)){
            System.out.println("Catalog: " + dirName);

            for (Path entry : dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry,BasicFileAttributes.class);

                if(attribs.isDirectory()) System.out.print("<DIR> ");
                else System.out.print("    ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e){

            System.out.println("Ошибка указания пути: " + e);


        }catch (NotDirectoryException e){
            System.out.println(dirName + " is not a catalog");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
