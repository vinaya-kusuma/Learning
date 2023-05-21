package com.practice;
//extends Thread
public class MultiThreadThing implements Runnable {
    public int threadNumber;
    public MultiThreadThing(int threadNumber){

        this.threadNumber = threadNumber;
    }
@Override
    public void run(){
        for(int i =0;i<4;i++){
            System.out.println(i + "from" +threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
