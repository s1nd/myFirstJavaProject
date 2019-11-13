package javaStudy19_thread;

public class Thread4 {
    public static void main(String[] args){
        Thread t11 = new Thread(() -> {
            System.out.println("Thread11");
        }, "thread11");
        Thread t12 = new Thread(() -> {
            System.out.println("Thread12");
        }, "Thread12");


        //优先级高的不一定会先执行
//        t12.setPriority(6);
//        t11.start();
//        t12.start();

        t12.start();
        try{
            t12.join(2000);
        }catch(InterruptedException e){
            System.out.println("[error-:]" + e);
        }
        t11.start();


    }
}

