package javaStudy19_thread;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Runnable1 {
    public static void main(String[] args){
        Thread t1 = new Thread(new aRunnable());
        t1.start();
    }
}
class aRunnable implements Runnable{
    public void run(){
        Scanner Scan = new Scanner(System.in);
        try {
            if (Scan.hasNext()) {
                String words = Scan.next();
                System.out.println(words);
            } else {
                throw (new IOException());
            }
        }catch(IOException e){
            System.out.println("[error-]:" + e);
        }finally{
            Scan.close();
        }
        try{
            sleep(1000);
            System.out.println("after 1 second, end...");
        }catch(InterruptedException e){
            System.out.println("[error-]:" + e);
        }
    }

}