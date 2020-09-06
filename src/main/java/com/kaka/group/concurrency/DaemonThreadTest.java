package com.kaka.group.concurrency;

import java.util.concurrent.*;

/*
The Daemon thread will be executed in back Ground and by default
main thread will not wait for completion of Daemon Thread.

we can use join() to make sure main Thread is waiting for Daemon to complete.
 */
public class DaemonThreadTest implements Runnable{

    //Executor executor = Executors.newFixedThreadPool(expectedConcurrentOrders);

    ExecutorCompletionService e =null;



  /*  int corePoolSize,
    int maximumPoolSize,
    long keepAliveTime,
    TimeUnit unit,
    BlockingQueue<Runnable> workQueue,
    ThreadFactory threadFactory,
    RejectedExecutionHandler handler*/


    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inner Thread Test");


        ExecutorService executor =  new ThreadPoolExecutor(1,
                1,
                0l,
                TimeUnit.MICROSECONDS,
                null,
                null,null);
      //  executor.submit()

        //executor.execute();
    }

    public static void main(String args[]) throws InterruptedException {

        DaemonThreadTest d = new DaemonThreadTest();
        Thread t = new Thread(d);
        t.setDaemon(true);
        t.start();
        t.join();

        System.out.println("The Main Thread executed");

    }
}
