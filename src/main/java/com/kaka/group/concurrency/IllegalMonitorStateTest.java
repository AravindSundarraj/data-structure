package com.kaka.group.concurrency;

/*
Test the IllegalMonitorState exception thrown by wait method
 */
public class IllegalMonitorStateTest {

    Boolean b = new Boolean(true);
    public static void main(String args[]){

        Thread t1 = new Thread((
                () ->{
                    IllegalMonitorStateTest illegalMonitorStateTest = new
                            IllegalMonitorStateTest();
                    try {
                        illegalMonitorStateTest.test();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ));

        Thread t2 = new Thread((
                () ->{
                    IllegalMonitorStateTest illegalMonitorStateTest = new
                            IllegalMonitorStateTest();
                    try {
                        illegalMonitorStateTest.updateBoolean();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        ));

        t1.start();
        t2.start();

    }

    public void test() throws InterruptedException {
        synchronized (this){
            Thread.sleep(5000);
            b.wait();
        }
    }

    public void updateBoolean(){
        b = new Boolean(true);
        System.out.println("updated the boolean");
    }
}
