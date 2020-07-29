package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
        MyObject myObject = new MyObject();
        Thread counter1 = new Thread(myObject);
        Thread counter2 = new Thread(myObject);
        Thread counter3 = new Thread(myObject);
        counter1.setName("My first thread");
        counter2.setName("My second thread");
        counter3.setName("My third thread");
        counter1.setPriority(1);
        counter2.setPriority(2);
        counter3.setPriority(2);
        System.out.println(counter1.getName());
        counter1.start();
        counter1.join();
        System.out.println(counter2.getName());
        System.out.println(counter3.getName());
        counter2.start();
        counter3.start();



    }
}
