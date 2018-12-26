package com.mars.demo.thread;

/**
 * @Author mars
 * @Email 13673180154@163.com
 * @Date 2018/12/26
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i =0;i<5;i++){
            System.out.println("线程B第"+i+"次执行");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
