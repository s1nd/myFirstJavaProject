package javaStudy19_thread;

//import javaStudy19_thread.MyThread;
public class Thread10 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new In();
        t.start();
//        System.out.println("threadName1:" + Thread.currentThread().getName());
//        System.out.println("threadName2:" + Thread.currentThread().getName());
//        System.out.println("getTState:" + t.getState());
//        System.out.println("get_state_value:" + Thread.State.values().toString());
        //当前线程main休息100ms
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");

//        在main出抛出异常
//        try{
//            Thread.sleep(1000);
//        }catch(InterruptedException e){
//            System.out.println("sleep error");
//        }
//        t.interrupt();
//        try{
//            t.join();
//        }catch(InterruptedException e){
//            System.out.println("join error");
//        }

    }

}

class In extends Thread{
   public void run (){
       int n = 0;

       while (! isInterrupted()) {
           System.out.println("study"+(n++));
           try{
               //处于sleep状态，main函数中的中断会抛出异常,导致t线程终止无效
               sleep(100);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
       }
    }
}
