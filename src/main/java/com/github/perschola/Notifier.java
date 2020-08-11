package com.github.perschola;

public class Notifier implements Runnable {
    final Message msg;

    public Notifier(Message message){
        msg = message;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started " );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (msg){
            msg.setMessage(Thread.currentThread().getName() + "Notifier word done ");
            msg.notifyAll();
        }

    }
}

