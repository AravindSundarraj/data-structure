package com.kaka.group.concurrency;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class SelfLock {

    public static void main(String args[]) throws Exception {
        Semaphore s = new Semaphore(3);
        //signal()
        ReentrantLock l = new ReentrantLock();
        Condition c = l.newCondition();
        Condition cc = l.newCondition();
        cc.signal();
        cc.signalAll();

        NonReentrantLock nreLock = new NonReentrantLock();

        // First locking would be successful
        nreLock.lock();
        System.out.println("Acquired first lock");

        // Second locking results in a self deadlock
        System.out.println("Trying to acquire second lock");

        nreLock.lock();
        System.out.println("Acquired second lock");

    }
}

class NonReentrantLock {

    boolean isLocked;

    public NonReentrantLock() {
        isLocked = false;
    }

    public synchronized void lock() throws InterruptedException {

        while (isLocked) {
            System.out.println("Wait call");
           wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}
