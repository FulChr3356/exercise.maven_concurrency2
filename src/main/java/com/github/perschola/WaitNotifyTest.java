package com.github.perschola;

public class WaitNotifyTest {
    public static void main(String[] args) {
            Message message = new Message("Test page 1");
            Waiter waiter = new Waiter(message);
            Thread thread1 = new Thread(waiter, "Waiter 1");
            thread1.start();
            Waiter waiter2 = new Waiter(message);
            Thread thread2 = new Thread(waiter2,"Waiter 2");
            thread2.start();
            Notifier notifier = new Notifier(message);
            Thread threadNotifier = new Thread(notifier,"notifier");
            threadNotifier.start();
            System.out.println("All threads have started");

    }
}
