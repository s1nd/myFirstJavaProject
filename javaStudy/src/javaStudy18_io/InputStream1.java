package javaStudy18_io;

import java.io.*;

public class InputStream1 {
    public static void main(String[] args) throws IOException,FileNotFoundException {
//      InputStream is = new input
        inputRead1();
    }
    public static void InputRead() throws FileNotFoundException,IOException{
        InputStream in = new FileInputStream("src/javaStudy18_io/test.txt");
        while(true){
            int n = in.read();
            if(n==-1){
                break;
            }
            System.out.println(n);

        }in.close();
    }
    public static void inputRead1() throws IOException, FileNotFoundException {
        InputStream in=null;
        try{
            in = new FileInputStream("src/javaStudy_io/test.txt");
            int n;
            while((n=in.read())!=-1){
                System.out.println(n);
            }
        }finally {
            if( in!=null){
                in.close();
            }
        }

    }
    public static void inputRead2() throws FileNotFoundException,IOException{
        try(InputStream in =new FileInputStream("src/javaStudy18_io/test.txt")){
            int n;
            while((n = in.read())!= -1){
                System.out.println(n);
            }

        }
        //自动close()
    }
    public static void inputRead3(){

    }
}
