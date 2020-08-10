package com.github.perschola;

public class AccountTest implements Runnable {
   public  final static Account account = new Account();

    public void run() {
        while(account.getBalance() > 0){
            synchronized (Thread.currentThread()) {
                account.withdrawal(10);
                System.out.println(Thread.currentThread().getName() + ": " + account.getBalance());
                try {
                    Thread.currentThread().wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


