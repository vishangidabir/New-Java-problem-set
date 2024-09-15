package com.company;

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements ChildSampleInterface{

    @Override
    public void meth1() {
        System.out.println("Hello");
    }

    @Override
    public void meth2() {
        System.out.println("Hii");
    }

    @Override
    public void meth3() {
        System.out.println("Take-Care");
    }

    @Override
    public void meth4() {
        System.out.println("Bye");
    }
}
public class Chw_50_InheretanceInInterface {
    public static void main(String[] args) {
        MySampleClass mySampleClass = new MySampleClass();
        mySampleClass.meth1();
        mySampleClass.meth2();
        mySampleClass.meth3();
        mySampleClass.meth4();



    }
}
