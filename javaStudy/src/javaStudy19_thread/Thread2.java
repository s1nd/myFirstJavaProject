package javaStudy19_thread;

public class Thread2 {
    public static void main(String[] args){
        Thread t = new Thread(new myRunnable(),"thread00");
        t.start();

//        lambda表达式
        Thread t1 = new Thread(() -> {
            System.out.println("new thread01 start!");
        },"thread01");

        //can not replicate 'start'
//        t1.start();
//        t1.start();

//        把他当成普通的方法,而不是一个线程执行体
        t1.run();
    }
}

class myRunnable implements Runnable{
    public void run(){
        System.out.println("new thread00 start!");
    }
}