package javaStudy21_sync;

import java.util.ArrayList;

public class Sync3 {
    public static void main(String[] args){
//        System.out.println("good morning");
        Account A = new Account("LiHua",700);
        AccountOperate AO = new AccountOperate(A);
        final int thread_Num = 5;
//        Thread[] threads = new Thread[thread_Num];
        ArrayList threads = new ArrayList();
        for(int i=0;i<thread_Num;i++){
            threads.add(new Thread(AO));
//            threads[i] = new Thread(AO);
//            threads[i].start();
        }
    }
}
class AccountOperate implements Runnable{
    public Account account;
    AccountOperate(Account account){
        this.account = account;
    }
        public void run(){
          synchronized(account){
              account.deposit(500);
              account.withdraw(500);
              System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
          }
    }
}
class Account{
    String Name = "";
    float amount = 0;
//    存款
    public Account(String name,float money){
        this.Name = name;
        this.amount = money;
    }
    void deposit(float money){
        amount += money;
        try{
           Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
//    取款
    void withdraw(float money){
        if(amount >= money){
            amount -= money;
        } else{
            System.out.println("余额不足");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
//    查询
    float getBalance(){
        return amount;
    }
}

