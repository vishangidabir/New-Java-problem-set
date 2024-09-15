package com.company;

interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
    }

interface HornBicycle{
    void horkOk();
    void blogHorn();

}
class Avoncycle implements Bicycle,HornBicycle{

        @Override
        public void applyBreak(int decrement) {
            System.out.println("Applying Break !");
        }

        @Override
        public void speedUp(int increment) {
            System.out.println("Increased the speed !");

        }

        @Override
        public void horkOk() {
            System.out.println("Kabhi kushi");
        }

        @Override
        public void blogHorn() {
            System.out.println("pop pop !");
        }
    }

public class Chw_48_Interface {
    public static void main(String[] args) {
        Avoncycle avoncycle = new Avoncycle();
        avoncycle.applyBreak(1);
        System.out.println(avoncycle.a);
        avoncycle.blogHorn();
    }
}
