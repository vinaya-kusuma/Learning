package com.practice;

public class MultiThreading {
    public static void main(String[] args){

        //MultiThreadThing multi1 = new MulItiThreadThing();
        //MultiThreadThing multi2 = new MultiThreadThing();
        //multi1.start();
        //multi2.start();
        for (int i=0;i<5;i++)
        {
            //using extends Thread
            //MultiThreadThing multi = new MultiThreadThing(i);
            //multi.start();

            //using implements Runnable
            MultiThreadThing multi = new MultiThreadThing(i);
            Thread myThread = new Thread(multi);
            myThread.start();
        }

    }
}
