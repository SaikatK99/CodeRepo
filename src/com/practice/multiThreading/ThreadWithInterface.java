package com.practice.multiThreading;

public class ThreadWithInterface implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Thread With Interface : "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadWithInterface threadWithInterface=new ThreadWithInterface();
        Thread thread=new Thread(threadWithInterface);
        thread.start();
        ThreadWithClass tc=new ThreadWithClass();
        tc.start();
    }
}
