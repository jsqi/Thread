package com.mars.demo.thread;


/**
 * @Author mars
 * @Email 13673180154@163.com
 * @Date 2018/12/26
 * 守护线程demo
 */
public class ThreadMain {
    public static void main(String[] args) {
        Thread threadA = new ThreadA();
        Thread threadB = new ThreadB();
        // 设置为守护线程，注意一定要在开始之前调用
        threadA.setDaemon(true);
        threadB.start();
        threadA.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("线程A是不是守护线程"+threadA.isDaemon());
        System.out.println("线程B是不是守护线程"+threadB.isDaemon());
        System.out.println("线程main是不是守护线程"+mainThread.isDaemon());
    }
}
