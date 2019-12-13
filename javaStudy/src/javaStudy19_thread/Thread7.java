package javaStudy19_thread;

public class Thread7 {
    public static void main(String[] args){
        Thread my1 = new Thread(() -> {
            for(int i = 0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+":get"+i);
            }
        },"threadMy1");
        Thread you1 = new Thread(new myTable(),"you1");
        my1.start();
        you1.start();

        //[join]add these code ,the execute order has be changed
//        try{
//            you1.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("max priority" + my1.MAX_PRIORITY);
        System.out.println("min priority" + my1.MIN_PRIORITY);
        System.out.println(my1.getState());
        System.out.println("norm priority" + my1.NORM_PRIORITY);
    }
}

class myTable implements Runnable{
    @Override
    public void run() {
        //直接调用？？
       show();
    }
    void show(){
        for(int i = 0;i < 5;i++){
            System.out.println(Thread.currentThread().getName()+":get"+i);
        }
    }
}
