package com.chinwe.multithreadcodetech.ch1.test;

import com.mythread.www.MyThread;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
