package javaStudy18_io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStream2 {
    public static void main(String[] args)throws IOException{
//        inputStream1();
        buffer1();
//        emulationInputStreamS();
    }

    public static void inputStream1() throws IOException {
        try(InputStream input = new FileInputStream("src/javaStudy18_io/test.txt")){
            int n;
            int count=0;
            while((n=input.read())!=-1){
                count++;
                System.out.print((char)n);
            }System.out.print(count);
        }
    }
    public static void buffer1()throws IOException{
        try(InputStream input = new FileInputStream("src/javaStudy18_io/test.txt")){
            byte[] b = new byte[10];
            int n;
            while ((n=input.read(b))!=-1){
                System.out.println("read "+n+" byte:");//如何输出内容
                for(byte bi:b){
                    System.out.print((char)bi);
                }
                System.out.println();
            }
//            read 10 byte:
//            hello!this
//            read 10 byte:
//            is a file
//            read 1 byte:
//            .is a file//????
        }
    }
    public static void emulationInputStreamS()throws IOException{
        byte[] b = {72,101,65,97,5,6};
        try(InputStream input  = new ByteArrayInputStream(b)) {
                int n = 0;
                while ((n = input.read())!=-1) {
                    System.out.println((char)n);//by ascii
            }
        }
    }
}
