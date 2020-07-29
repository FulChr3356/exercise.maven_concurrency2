package com.github.perschola;

public class MyObject implements Runnable {

    public void run() {
        int seconds = 1;
        while(seconds < 6) {
            System.out.println(seconds);
            seconds+=1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

    public void start(){

    }
}
