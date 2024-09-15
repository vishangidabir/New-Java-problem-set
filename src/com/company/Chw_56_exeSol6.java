package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("My cooking Thread 1 is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Thread 1 is good chatter");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class Chw_56_exeSol6 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}
