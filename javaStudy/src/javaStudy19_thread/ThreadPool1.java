package javaStudy19_thread;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPool1 {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=0;i<5;i++){
            executor.submit(new Task("task"+i));
        }
        executor.shutdown();
    }
}

class Task implements Runnable{
    private final String name;
    Task(String n){
        name = n;
    }
    public void run(){
        System.out.println("start"+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end"+name);
    }
}
