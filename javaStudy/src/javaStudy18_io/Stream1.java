package javaStudy18_io;

import java.io.*;
//refer to https://www.runoob.com/java/java-files-io.html
public class Stream1 {

    //公共流
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args){
//        test1();
//        readLine();
//        quit();
        printLn();
    }

    //[PrintStream].println()
    public static void printLn(){
        File f = new File(".test.txt");
        if(f.exists()) {
            try {
                PrintStream s2 = new PrintStream(f);
                s2.println("good");
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("file is not found");
        }
    }
    //不停读取，直到输入q
    public static void quit(){
        Stream1 st1 = new Stream1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        try{
//            System.out.println((char)st1.br1.read());


            //saqa
//            => s
//            => a
//            => q
//            process finished
            do{
                c = (char) br.read();
                System.out.println(c);
            }while(c != 'q');

        }catch(IOException e){

            e.printStackTrace();
        }
    }
//    读取一个字符,并且输出
    public static void test1(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter a character");
        char c;
        try {
            c = (char)br.read();
            System.out.println(c);

        }catch(IOException e){
            System.out.println(e);
        }
    }

//    读取一行字符，并输出
    public static void readLine(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String s = (String) br.readLine();
//            reads a single character,return int(ascii encoding)
            char c = (char)br.read();
            System.out.println(c);
            System.out.println(s);
        }catch(IOException e){
//            System.out.println(e.printStackTrace());
            e.printStackTrace();
        }
    }
//    error!
    public static void available(){
//        InputStream is a abstract class, cannot be instantiated
//        InputStream a = new InputStream();
    }


}

