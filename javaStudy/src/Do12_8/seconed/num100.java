package Do12_8.seconed;

public class num100 {
    public static void main(String [] args){
        Thread odd = new Thread(new odd());
        Thread ou = new Thread(new ou());

        ou.start();
        odd.start();
    }
}
class odd implements Runnable{
    public void run(){
        for(int i = 1;i<10;i+=2){
            System.out.println(i);
//            try{
//               Thread.sleep(1000);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//
//            }

        }
    }
}
class ou implements Runnable{
    public void run(){
        for(int i = 0;i<10;i+=2){
            System.out.println(i);
        }
//        try{
//            Thread.sleep(1000);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//
//        }
        Thread.yield();
    }
}
