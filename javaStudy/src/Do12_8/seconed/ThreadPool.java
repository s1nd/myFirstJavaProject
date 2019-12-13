package Do12_8.seconed;

import java.util.LinkedList;
import java.util.List;

public class ThreadPool {
//    默认工作数为5
    private static int Worker_num = 5;
    private WorkThread[] WorkThreads;
    private static int finished_task=0;
    private List<Runnable> taskQueue = new LinkedList<Runnable>();
    private static ThreadPool ThreadPool;
    private ThreadPool(){
        this(5);
    }
    private ThreadPool(int worker_num){
//        ThreadPool.
    }
//    内部类
    private class WorkThread{

    }
}
