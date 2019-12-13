package javaStudy19_thread;

public class Thread9 {
    public static void main(String[] args){
        Runnable r = new hisThread();
        Thread he = new Thread(r);
//        r.show();
        he.start();
    }
}

class hisThread implements Runnable{
    public void run(){
       show();
    }
    void show(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + ":get" + i);
        }
    }
}
