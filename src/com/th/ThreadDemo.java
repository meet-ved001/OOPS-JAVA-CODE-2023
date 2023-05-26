package com.th;
class First extends Thread
{
    public void run(){
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is First thread "+i);
        }
        System.out.println("Finished running the First thread.");
    }
}

public class ThreadDemo 
{	
    public static void main(String[] args) throws InterruptedException   
    {
    
    	First s1 = new First();
        s1.start();
        s1.setPriority(Thread.MAX_PRIORITY);
        for(int j=0;j<=5;j++)
        {
            Thread.sleep(2000);
            System.out.println("Main Thread "+ j);
        }
        System.out.println("Finished Running the Main Thread...");
    }
}