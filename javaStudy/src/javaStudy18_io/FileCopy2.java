package javaStudy18_io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileCopy2 {
    private final static File inf = new File("src/javaStudy18_io/a.txt");
    public static void main(String[] args) throws IOException{
//        inf.getPath();
//        System.out.println(inf.length());
        copy1();
    }

    public static void copy1()throws IOException {
        //必须在括号里声明变量
        try(RandomAccessFile raf = new RandomAccessFile(inf,"r")){
            byte[] b = new byte[21];
            int n;
            n = raf.read(b);
            for(byte bi:b){
                System.out.print((char)bi);
            }

            pointer(raf);
            System.out.println("n:"+n);
            raf.seek(110);

            n = raf.read(b);
            for(byte bi:b){
                System.out.print((char)bi);
            }
            System.out.println();
            System.out.println("pointer at:"+raf.getFilePointer());

        }

    }
    public static void pointer(RandomAccessFile raf) throws  IOException{
        System.out.println();
        System.out.println("length:"+raf.length());
        System.out.println("pointer at:"+raf.getFilePointer());
    }

}
