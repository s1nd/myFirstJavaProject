package javaStudy19_thread;

import java.util.concurrent.*;

public class Future1 {
    public static void main(String[] args) throws InterruptedException{
//        Callable c = new Task("cllable");
        Callable<String> c = new FutureTask("future");
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<String> f = es.submit(c);
        try {
            //等待的时间，超时抛出异常如果设置为1000，会抛出异常
            System.out.println(f.get(2000,TimeUnit.MILLISECONDS));
        } catch (ExecutionException e) {
            e.printStackTrace();
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }
}
class FutureTask implements Callable<String>{
    private final String name;
    FutureTask(String n){
        name = n;
    }
    public String call(){
        System.out.println("start:"+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("end"+name);
        return "end:"+name;
    }

}
