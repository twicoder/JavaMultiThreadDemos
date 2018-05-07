package com.chinwe.multithreadcodetech.ch1.test;

import com.mythread.www.MyThreadSleepRandomSeconds;

public class TestMyThreadSleepRandomSeconds {
    public static void main(String[] args) {
        try {
            MyThreadSleepRandomSeconds thread = new MyThreadSleepRandomSeconds();
            thread.setName("myThread");
            thread.start();
            for(int i=0;i<10;i++) {
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
