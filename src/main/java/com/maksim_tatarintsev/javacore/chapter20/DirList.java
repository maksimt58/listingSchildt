package com.maksim_tatarintsev.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "d:/IdeaProjects";
        File f1 = new File(dirname);
        if(f1.isDirectory()) {
            System.out.println("catalog: " + f1);
            String[] s = f1.list();

            for (String value : s) {
                File f = new File(dirname + "/" + value);
                if (f.isDirectory()) {
                    System.out.println(value + " is the catalog");
                } else {
                    System.out.println(value + " is the file");
                }
            }
        }else{
            System.out.println(dirname + " is not a catalog");
        }
    }
}
