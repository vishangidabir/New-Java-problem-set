package com.company;

class Animal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I can eat belong to animal !");
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat and apple !");
    }
}

class Dog extends Animal{
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void speak(){
        System.out.println("i can speak belong to dog !");
    }
}

public class Chw_43_Inheretence_topic {
    public static void main(String[] args) {
        // create object of Animal class
        Animal animal = new Animal();
        animal.setName("Harry");
        String n = animal.getName();
        System.out.println(n);
        animal.eat();

        //create object of dog class
        Dog dog = new Dog();
        dog.setType("French Bulldog");
        String t = dog.getType();
        System.out.println(t);

    }
}
