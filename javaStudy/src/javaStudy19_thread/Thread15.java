package javaStudy19_thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Thread15 {
    public static void main(String[] args) throws InterruptedException{
        TaskQueue q = new TaskQueue();
        List<Thread> ts = new ArrayList<>();
        //创建五个线程，分别加入线程ArrayList,做任务
            for(int i=0;i<5;i++){
                Thread t = new Thread(()->{
                    while(true){
                        //写在方法后面的线程处理没用？？？
                        try {
                            String s = q.getTask();
                            System.out.println(s + "is finished");
                        } catch (InterruptedException e) {
                            //getTask()遇到异常时结束
//                            e.printStackTrace();
                            return;
                        }
                    }
                });
                t.start();
                ts.add(t);
            }
         Thread add = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    String s = "task"+Math.random();
                    System.out.println("add:" + s);
                    q.addTask(s);
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                        return ;
                    }
                }
            }
         };
            add.start();
            add.join();
            Thread.sleep(100);
            for(Thread t:ts){
                t.interrupt();
            }
    }
}
class TaskQueue{
    Queue<String> queue = new LinkedList<>();
    public synchronized void addTask(String s){
        this.queue.add(s);
        this.notifyAll();
    }
    public synchronized String getTask() throws InterruptedException{
//        因为线程被唤醒时，需要再次获取this锁。多个线程被唤醒后，只有一个线
//        程能获取this锁，此刻，该线程执行queue.remove()可以获取到队列的元素
//        ，然而，剩下的线程如果获取this锁后执行queue.remove()，此刻队列可能
//        已经没有任何元素了，所以，要始终在while循环中wait()，并且每次被唤醒
//        后拿到this锁就必须再次判断
        while(queue.isEmpty()){
            this.wait();
        }
        return queue.remove();
    }

}
