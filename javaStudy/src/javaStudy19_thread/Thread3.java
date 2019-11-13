package javaStudy19_thread;

public class Thread3 {
    public static void main(String[] args){
        System.out.println("main start");
        Thread t01 =  new Thread(){
            public void run(){
                System.out.println("t01 start!");
                System.out.println("t01 end!");
            }
        };
        t01.start();
        System.out.println("main end!");
    }
}
