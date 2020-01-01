package javaStudy19_thread;

public class Thread9 {
    public static void main(String[] args){
        hisThread r = new hisThread();
        Thread t = new Thread(r);
        r.show();
        t.start();

    }
}

class hisThread implements Runnable{
    public void run(){
       show();
    }
    public  void show(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + ":get" + i);
        }
    }
}
