package javaStudy19_thread;
import javaStudy19_thread.hisThread;
public class Thread12 {
    public static void main(String[] args) throws InterruptedException{
        //如何get main线程对象

        //总是使用第一种使当前线程进入休眠
//        Thread.sleep(1000);
//        Thread.currentThread().sleep(1000);
        Runnable r = new IN2();
        Thread t = new Thread(r);

        t.start();
        Thread.sleep(100);
        //直接使用interrupt()并不会终止，还应将while(! isInterrupted())写入run方法
//        t.interrupt();
//        r.running = false;
        IN2.running = false;
        t.join();
        System.out.println("main end");

    }
}
class IN2 implements Runnable{
    public static boolean running = true;
    public void run(){
        while(running){
            System.out.println("alive");
        }
    }
}
