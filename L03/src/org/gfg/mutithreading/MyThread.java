package org.gfg.mutithreading;

public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("MyThread running in "+Thread.currentThread().getName());
    }
}
