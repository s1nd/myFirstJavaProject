package javaStudy18_io;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args)
            throws IOException{
//        File f1 = new File("src/javaStudy18_io/test.txt");
        File f1,f2,f3;
//        try {
//            f1 = new File("..\\src\\javaStudy18_io\\test.txt");
//            f1 = new File(".\\
        f1 = new File("H:\\code\\test\\test.txt");
        f2 = new File("..");
        f3 = new File("test.txt");
//            System.out.println(f1.getPath());
//            System.out.println(f1.isFile());
//            System.out.println(f1.canExecute());
//            System.out.println(f3.isFile());
//        }catch(IOException e){
//            System.out.println("[error-]");
//        }

        OutputStream pen = null;
        pen = new FileOutputStream(f1);
        String str = "wrote haha";
        byte b[] = str.getBytes();
//        System.out.println(b[0]+b[1]);

        //重写文件
        pen.write(b);
//        System.out.println("write success");
        pen.close();

        //读文件
        InputStream contain = new FileInputStream(f1);
        byte rb[] = new byte[10];
        contain.read(rb);
        contain.close();
        System.out.println(rb);
        System.out.println(new String(rb));

    }
}
