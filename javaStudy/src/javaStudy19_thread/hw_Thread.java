package javaStudy19_thread;

public class hw_Thread {
    static leftHand left;
    static rightHand right;
    public static void main(String[] args){
        left = new leftHand();
        right = new rightHand();

        //优先级不能保证线程先执行
        left.setPriority(9);


        left.start();
        right.start();
    }
}

class leftHand extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("you are students");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){

            }
        }
    }
}

class rightHand extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("you are teacher");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){

            }
        }

    }
}