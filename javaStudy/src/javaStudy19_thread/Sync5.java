package javaStudy19_thread;

public class Sync5 {
    public static final Object block1  = "block1";
    public static void main(String[] args) throws InterruptedException{
        AddOne t1 = new AddOne();
        SubOne t2 = new SubOne();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Block.count);
    }
}
class Block{
    public static final Object block = "block";
    public static Integer count = 0;
}
class AddOne extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            //AddOne和SubOne必须都同步，且是同一个锁
            synchronized (Sync5.block1){
                Block.count++;
            }
        }
    }
}
class SubOne extends Thread{
    public void run(){
        for (int i=0;i<10000;i++){
            synchronized (Sync5.block1){
                Block.count--;
            }
        }
    }
}
