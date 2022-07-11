package com.maksim_tatarintsev.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "d:/IdeaProjects";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list(only);
        //String[] s = f1.list(((dir, name) -> name.endsWith(".html")));

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
