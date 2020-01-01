package javaStudy18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream1 {
    public static void main(String[] args) throws IOException{
//        write1();
        write2();
    }
    public static void write1() throws IOException {
        try(OutputStream output = new FileOutputStream("src/javaStudy18_io/output.txt")){
            output.write(72);
            output.write("world".getBytes("utf-8"));//string to byte array
            output.write("\n".getBytes("utf-8"));
            output.write("hello gays".getBytes("utf-8"),1,7);//offset refer to byteArray
        }
    }
    public static void write2() throws IOException {
        try(OutputStream output  = new FileOutputStream("src/javaStudy18_io/output2.txt")){
            output.write(72);
        }
    }
}
