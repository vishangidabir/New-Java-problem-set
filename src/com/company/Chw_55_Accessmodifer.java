package com.company;

class Charger{
public int x = 5;
protected int y = 10;
int w = 20;
private int z = 15;

public void meth1(){
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(w);
}

}

public class Chw_55_Accessmodifer {
    public static void main(String[] args) {
        Charger charger = new Charger();
        charger.meth1();
        System.out.println("I am class main method");
    }
}
