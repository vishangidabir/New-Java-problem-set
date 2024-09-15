package com.company;

class A{
    public int a =6;
    public int meth1(){
        return 12;
    }

    public void meth2(){
        System.out.println("Method 2 of class A");
    }
}

class B extends A{
    public void meth2(){
        System.out.println("Method 2 of class B");
    }

    public void meth3(){
        System.out.println("Method 3 of class B");
    }

}


public class Chw_44_method_overloding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
