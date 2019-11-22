package javaStudy18_io;
import java.io.*;
public class Stream2 {
    public static void main(String[] args){
        File f = new File("text.txt");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }

}
