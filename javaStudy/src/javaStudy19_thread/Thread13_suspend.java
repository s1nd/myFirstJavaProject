package javaStudy19_thread;

public class Thread13_suspend {
    static Thread t = new Thread(()->{
        System.out.println("after 2 second");
    });
    static Thread t1 = new Thread(()->{
        System.out.println(Thread.currentThread().getName()+" start");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" end");
    });
    public static void main(String[] args) throws InterruptedException{
//        t1.start();
//        t1.join();
//        //两秒后执行线程t
//        t.start();

        Thread t2 = new Thread(new Thread(() -> {
            int i=0;
            while(true){

                System.out.println("alive"+i++);
            }
        }));
        t2.start();
        boolean flag = false;
        //每隔3秒切换一次状态
        while(true){
            flag = !flag;
            Thread.sleep(3000);
            if(flag){
                t2.suspend();
                // suspend已被弃用 t2.wait();
            }else{
                t2.resume();
            }
        }
    }
}



