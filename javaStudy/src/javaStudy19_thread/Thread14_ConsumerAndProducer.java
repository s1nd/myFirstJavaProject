package javaStudy19_thread;

public class Thread14_ConsumerAndProducer {
    static int count = 0;
    public static void main(String[] args) throws InterruptedException{
        Thread add = new Thread(()->{
            for(int i=0;i<10000;i++){
                count++;
            }
        });
        Thread sub = new Thread(()->{
            for(int i=0;i<10000;i++){
                count--;
                System.out.println(count);
            }
        });
        //不是原子操作，不能保证结果是零
        add.start();
        sub.start();
        add.join();
        sub.join();

        System.out.println("count is:"+count);
    }
}
