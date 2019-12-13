package javaStudy19_thread;

public class THread8 {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            for(int i = 0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + ":get" + i);
                try {
                    Thread.sleep(1000); // 线程休眠500毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread1");
        t1.start();

        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + ":get" + i);
            //在main：get2之后将thread1执行完
            if(i==2){
                try{
                    t1.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
