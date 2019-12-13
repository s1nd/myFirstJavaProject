package javaStudy21_sync;

public class Sync2 {
    public static void main(String[] args){
        SyncR1 r = new SyncR1();
        Thread t1 = new Thread(r,"A");
        Thread t2 = new Thread(r,"B");
        t1.start();
        t2.start();
    }
}

class SyncR1 implements Runnable{
    private static int count = 0;
    public void run(){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("A")){
            Print1();
        }else if(threadName.equals("B")){
            Print2();
        }else{
            System.out.println("the name is not A or B");
        }
    }
    public void Print(String printI){
        for(int i=0;i<5;i++){
            try{
                System.out.println(printI + "-" + Thread.currentThread().getName()+":"+(count++));
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void Print1(){
        synchronized (this){
            Print("print1");
        }

    }
    public void Print2(){
      Print("print2");
    }

    public int getCount(){
        return count;
    }
}
