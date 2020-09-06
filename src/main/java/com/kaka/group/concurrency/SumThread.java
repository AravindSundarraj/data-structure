package com.kaka.group.concurrency;
/*
simple compare between single and multiple Thread
 */
public class SumThread {

    private long start;
    private long end;
    private long sum;

    public SumThread() {
        System.out.println("I am Default Constructor ...");
    }

    public SumThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return this.sum;
    }

    public static void main(String args[]) throws InterruptedException {

        SumThread sums = new SumThread();
        sums.test();

    }

    public void add() {

        while (this.start <= this.end) {
            this.sum += this.start;
            this.start++;
        }


    }

    public static void singleThread() {

        long startTime = System.currentTimeMillis();
        SumThread sumThread = new SumThread(1, Integer.MAX_VALUE);
        sumThread.add();
        long endTime = System.currentTimeMillis();
        System.out.println("Single Total :" + sumThread.getSum());
        System.out.println("Single Thread Execution Time :" + (endTime - startTime));
    }

    public static void multipleThread() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int k = Integer.MAX_VALUE / 2;

        SumThread s1 = new SumThread(1, k);
        SumThread s2 = new SumThread(k + 1, Integer.MAX_VALUE);

        Thread t1 = new Thread(
                () -> {
                    s1.add();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    s2.add();
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Multiple Total :" + (s1.getSum() + s2.getSum()));
        System.out.println("The Multiple Thread Time Taken:" + (endTime - startTime));

    }

    public void test() throws InterruptedException {
        singleThread();
        multipleThread();
    }
}
