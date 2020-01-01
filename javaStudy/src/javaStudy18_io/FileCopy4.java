package javaStudy18_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
//默认片段长度singlelength大于bytesize
public class FileCopy4 {
    static File in = new File("src/javaStudy18_io/timg.jpg");
    static File out = new File("src/javaStudy18_io/t.jpg");
    static int inLen = (int)in.length();
    static int ThreadNum =3;
    public static void main(String[] args)throws IOException{

        int singleLength = (int)inLen/ThreadNum+1;
        CopyThread r;
        Thread t;
        for(int i = 0;i<ThreadNum;i++){
            r = new CopyThread(i*singleLength,(i+1)*singleLength,"task"+i);
            t = new Thread(r);
            t.start();
        }
    }
}

class CopyThread implements Runnable{
    int start;
    long end;
    String taskName;
    int inLen = FileCopy4.inLen;
    CopyThread(int start,int end,String taskName){
        this.start = start;
        this.end = end;
        this.taskName = taskName;
    }
    public void run(){
        try{
            if(FileCopy4.out.exists()){
                FileCopy4.out.createNewFile();
            }
            RandomAccessFile inf = new RandomAccessFile(FileCopy4.in,"r");
            RandomAccessFile ouf = new RandomAccessFile(FileCopy4.out,"rw");
            int byteSize=20;
            byte[] b = new byte[20];//byteSize=20
            inf.seek(start);
            ouf.seek(start);
            while(inf.getFilePointer()<end&&inf.read(b)!=-1){
//                inf.seek(start);
//                System.out.println(inf.read(b));
                for(byte bi:b){
                    System.out.print((char)bi);
                }
                System.out.println();
//                ouf.seek(start);
                //b可能大于singleLength
//                System.out.println(inf.getFilePointer());
                System.out.println(Thread.currentThread().getName()+"pointer at:"+ouf.getFilePointer());
                if(ouf.getFilePointer()+byteSize<inLen){
                    ouf.write(b);
                }else{
                    ouf.write(b,0,inLen-(int)ouf.getFilePointer());
                    System.out.println(inLen-(int)ouf.getFilePointer());
                }


            }
            System.out.println(taskName+" end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void r(){

    }
}
