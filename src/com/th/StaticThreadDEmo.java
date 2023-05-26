package com.th;

public class StaticThreadDEmo
{
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("Is thread alive? "+t1.isAlive());
        System.out.println(t1);
        t1.setName("Meet Ved");
        System.out.println(t1);
        t1.setPriority(10);
        System.out.println(t1);
    }
}
