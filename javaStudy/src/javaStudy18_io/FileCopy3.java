package javaStudy18_io;

import java.io.*;

public class FileCopy3 {
    static int threadNums;
    Thread[] t;
    static File af = new File("src/javaStudy18_io/a.txt");
    public static void main(String[] args){

    }
    public static void copya() throws IOException {
        try(RandomAccessFile raf = new RandomAccessFile(af,"r")){
            try(OutputStream bf = new FileOutputStream("b.txt")){
                int singleLen = (int)raf.length()/threadNums+1;
                for(int i=0;i<threadNums;i++){
                    int finalI = i;
                    Thread t = new Thread(()->{
                        byte[] b = new byte[1000];
                        int n=0;
                        int pointer=0;
                        while(true){
                            try {
//                                finalI,这是什么操作，但是没有影响
//                                可能会略超出singleLen的长度
                                if(!(raf.getFilePointer()<singleLen* finalI))break;
                                raf.read(b);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }

                    });
                    t.start();
                }
            }


        }
    }

}
