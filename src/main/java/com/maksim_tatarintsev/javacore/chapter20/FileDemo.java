package com.maksim_tatarintsev.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("d:/test.txt");
        p("File name " + f1.getName());
        p("Path " + f1.getPath());
        p("Absolute path " + f1.getAbsolutePath());
        p("Parent " + f1.getParent());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canWrite() ? "available for write" : "not available for write");
        p(f1.canRead() ? "available for read" : "not anailable for read");
        p(f1.isDirectory() ? "is directory" : "is not directory");
        p(f1.isFile() ? "is file" : "is not file");
        p(f1.isAbsolute() ? "is absolute" : "is npt absolute");
        p("Last modify " + f1.lastModified());
        p("Size " + f1.length() + " byte");

    }
}
