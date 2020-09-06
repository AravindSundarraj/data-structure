package com.kaka.group.concurrency;

public class InterruptedTest extends Thread{

    public static void main(String args[]){

        InterruptedTest i = new InterruptedTest();
        i.start();
        i.interrupt();

    }


    public void run(){

        System.out.println("I am going to sleeping now");
        try {
            InterruptedTest.sleep(10000);
        }
        catch(InterruptedException i){
            System.out.println("is interrupted ==>" +Thread.currentThread().isInterrupted());
        }
        System.out.println("I am Not sleeping now");

    }
}
