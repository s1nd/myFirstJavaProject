package javaStudy18_io;

import java.io.File;
import java.net.URI;
import java.net.URL;

public class File1 {
    public static void main(String[] args){
//        File f = new File(URI.create("./test.txt"));
//        File f = new File("H:\\Test\\JavaFileTest.txt");
//        System.out.println(f);
        //file对象既可以表示一个文件,也可以表示一个目录
        File f = new File("H:\\Test");
        File f1 = new File("..");
        System.out.println(f1.list());
    }
}
