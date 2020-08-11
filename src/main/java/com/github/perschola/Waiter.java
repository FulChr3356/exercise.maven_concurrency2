package com.github.perschola;

import java.util.Date;

public class Waiter implements Runnable {
        private final Message msg;
        public Waiter(Message message){
            msg = message;
        }
        Date date = new Date();
        @Override
        public void run() {
            synchronized (msg) {
                System.out.println(Thread.currentThread().getName() + " waiting to get notified at time: " + date.getTime());
                try {
                    msg.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " waiter thread got notified at time: " + date.getTime() + "," + Thread.currentThread().getName() + " Processed: " + msg);
            }


        }
}
