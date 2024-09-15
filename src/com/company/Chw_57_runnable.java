package com.company;

class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am thread 1 ");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am thread 2");
            i++;
        }
    }
}

    public class Chw_57_runnable {
        public static void main(String[] args) {
            MyThreadRunnable1 t1 = new MyThreadRunnable1();
            Thread tin1 = new Thread(t1);
            tin1.start();

            MyThreadRunnable2 t2 = new MyThreadRunnable2();
            Thread tin2 = new Thread(t2);
            tin2.start();

        }
    }
