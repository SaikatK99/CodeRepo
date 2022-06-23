package com.practice.multiThreading;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program Stared");
        Thread thread=Thread.currentThread();
        System.out.println("Current Thread Name: "+thread.getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setName("ThreadOperation");
        System.out.println("Changed Thread Name: "+thread.getName());

    }
}
