package com.maksim_tatarintsev.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {
    public static void main(String[] args) {
        String dirName = "D:\\IdeaProjects";

        System.out.println("Дерево каталогов, начиная с каталога " + dirName + ":\n");

        try{
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
