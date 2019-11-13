package javaStudy19_thread;

public class Thread1 {
    public static void main(String[] arg){
        ThreadGroup g1 = new ThreadGroup("first");
        ThreadGroup g2 = new ThreadGroup("second");

        Thread t1 = new Thread(g1,"myThread1");
        Thread t2 = new Thread(g1,"myThread2");
        Thread t3 = new Thread(g2,"myThread3");
//        Thread t = new Thread();
//        t1.start();
//        System.out.println(t1.currentThread());
//        System.out.println(t1.getAllStackTraces());

//        System.out.println(t1.getState());
//        System.out.println(t1.getThreadGroup().getName());
//        System.out.println(t1.getName());

        //test myThread
        myThread th = new myThread();
        th.start();
    }
}

class myThread extends Thread{
    public void run(){
        System.out.println("start a new thread");
        try{
            sleep(1000);
            System.out.println("after 1 second");
            sleep(1000);
            System.out.println("after 2 seconds");
        }catch(InterruptedException e){
            System.out.println("[error-]:"+e);
        }
    }
}
