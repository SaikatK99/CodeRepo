package com.practice.multiThreading;

public class ThreadWithClass extends Thread{

    @Override
    public void run() {
        for (int i=5;i>=1;i--){
            System.out.println("Thread With Class : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ThreadWithClass().start();
    }
}
