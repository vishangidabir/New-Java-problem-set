package com.company;

abstract class Parents{
    public Parents() {
        System.out.println("I am constructor of parent class !");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parents{
    @Override
    public void greet(){
        System.out.println("hello Morning");
    }
}

abstract class Child1 extends Parents{
    public void th(){
        System.out.println("hello");
    }
}


public class Chw_47_abstract {
    public static void main(String[] args) {
//        Parents p = new Parents();
        Child c = new Child();
//        Child1 c1 = new Child1();
    }
}
