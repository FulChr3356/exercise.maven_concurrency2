package com.github.perschola;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest  implements Runnable {
   public  final static Account account = new Account();

    public void run() {
        while(account.getBalance() > 0){
            synchronized (account) {
                account.withdrawal(10);
                System.out.println(Thread.currentThread().getName() + ": " + account.getBalance());
                Thread.currentThread().notifyAll();
                try {
                    Thread.currentThread().wait(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void testRun(){
        Thread thread = new Thread(this,"Reema");
        Thread thread1 = new Thread(this,"Ranjeet");
        thread.start();
        thread1.start();
        account.getBalance();
    }
}


