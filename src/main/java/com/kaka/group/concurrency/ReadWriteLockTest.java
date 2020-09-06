package com.kaka.group.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

   static Map<String , Integer> testReadWrite = new HashMap<>();

    static{
        System.out.println("I am Static block ...");
        testReadWrite.put("USD" , 234 );
        testReadWrite.put("EUR" , 345 );
        testReadWrite.put("ISO" , 343 );

    }

    int incre = 0;
    ReadWriteLock lockTest = new ReentrantReadWriteLock(false);
    public static void main(String args[])throws Exception{
        ReadWriteLockTest r = new ReadWriteLockTest();

        Thread t1 = new Thread( () ->{
            try {
                r.readData("USD");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread( () ->{
            try {
                r.readData("EUR");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t4 = new Thread( () ->{
            try {
                r.readData("ISO");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread t5 = new Thread( () ->{
            try {
                r.readData("USD");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t6 = new Thread( () ->{
            try {
                r.readData("ISO");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread( () ->{
            try {
                r.writeData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t8 = new Thread( () ->{
            try {
                r.writeData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t8.start();
        t6.start();



    }

    public void readData(String key) throws InterruptedException {
        lockTest.readLock().lock();
        Thread.sleep(500);
       Integer v= testReadWrite.get(key);
        System.out.println("Read value "+ key  + " == " +v );
        lockTest.readLock().unlock();
    }


    public void writeData() throws InterruptedException {
        lockTest.writeLock().lock();
        System.out.println("Write value =="  );
        Thread.sleep(1000);
        testReadWrite.put("USD" , 234+ 1 );
        testReadWrite.put("EUR" , 345 + 1 );
        testReadWrite.put("ISO" , 343  + 1);
        lockTest.writeLock().unlock();
    }
}
