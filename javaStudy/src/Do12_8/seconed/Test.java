package Do12_8.seconed;

public class Test {
    public static void main(String [] args){
        Thread pd1 = new Thread(new Producter(),"thread1");
        Thread pd2 = new Thread(new Producter(),"thread2");
        Thread ct1 = new Thread(new Comsumer(),"thread3");
        pd1.start();
        pd2.start();
        ct1.start();

//        System.out.print(Pub.Lock);
    }
}
class Comsumer implements Runnable{
    public void run(){
        for(int i=0;i<20;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Pub.Lock) {
                 while(Pub.num < 1) {
                    try {
                        Pub.Lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Pub.num--;
                System.out.println(Thread.currentThread().getName() + ":current_num=" + Pub.num);
                Pub.Lock.notifyAll();
            }
        }
    }
}
class Producter implements Runnable{
    public void run(){
        for(int i=0;i<10;i++) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            synchronized (Pub.Lock) {
                while(Pub.num == Pub.Full){
                    try {
                        Pub.Lock.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                Pub.num++;
                System.out.println(Thread.currentThread().getName()+":current num="+Pub.num);
                Pub.Lock.notifyAll();
            }
        }
    }
}
class Pub{
    public final static String Lock= "lock";
    public static Integer Full = 8;
    public static Integer num = 0;

}