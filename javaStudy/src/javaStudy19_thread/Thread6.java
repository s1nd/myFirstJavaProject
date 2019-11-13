package javaStudy19_thread;

public class Thread6 {
    public static void main(String[] args) throws InterruptedException{
        Thread t61 = new Thread61();
        t61.start();
        Thread.sleep(1000);
        //?? t61,t62 不会被终止??
        t61.interrupted();
        t61.join();
        System.out.println("main end");
    }
}

class Thread61 extends Thread{
    public void run() {
        Thread t62 = new Thread(new Thread62());
        t62.start();
        try{
            t62.join();
        }catch(InterruptedException e){
            System.out.println("t62 end");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("sleep 1000");
        }
        t62.interrupt();
        System.out.println("t62 dead");
    }
}

class Thread62 implements Runnable{
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("haHa,i'm live");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                break;
            }
        }
//        System.out.println("thread62");
    }
}
