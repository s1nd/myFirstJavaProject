package javaStudy21_sync;

public class Sync {
    public static void main(String[] args){
        SyncR  r = new SyncR();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        //不同步，是两个不同的Sync对象
//        Thread t1 = new Thread(new SyncR());
//        Thread t2 = new Thread(new SyncR());
        t1.start();
        t2.start();
    }
}
class SyncR implements Runnable{
    private static int count = 0;
    public void run(){
        synchronized (this){
            for(int i=0;i<5;i++){
                try{
                    System.out.println(Thread.currentThread().getName()+":"+(count++));
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
            }
        }
    }
    public int getCount(){
        return count;
    }
}
