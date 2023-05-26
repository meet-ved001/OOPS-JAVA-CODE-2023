package com.th;

class NewRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is NewRunnable thread "+i);
        }
        System.out.println("Finished running the runnable thread.");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        NewRunnable obj = new NewRunnable();
        Thread t1=new Thread(obj);
        t1.start();
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is MAIN METHOD thread "+i);
        }
        System.out.println("Finished running the main method.");

    }
   }
