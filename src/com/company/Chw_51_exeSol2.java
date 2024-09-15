package com.company;

abstract class Pen{
    abstract void write();

    abstract void refill();
    }

class FountainPen extends Pen{
    void write(){
        System.out.println("Hello Java");
    }

    void refill(){
        System.out.println("Refill");
    }

    void changeNib(){
        System.out.println("Change Nib");
    }
}

public class Chw_51_exeSol2 {
    public static void main(String[] args) {
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
    }
}
