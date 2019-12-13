package Do12_8.seconed;

import java.util.ArrayList;

public class Test2 {
    int threadNum = 3;
    ArrayList<Thread> work_thread;
    public void startConsumerThread(){
        ArrayList<Thread> Con = new ArrayList<>();
        for(int i=0;i<threadNum;i++){
            Con.add(new Thread(new Comsumer()));
//            Con.forEach(Thread::start);
            Con.get(i).start();
        }


    }
    public void startProducerThread(){
        Thread[] Pro ;
    }

}


