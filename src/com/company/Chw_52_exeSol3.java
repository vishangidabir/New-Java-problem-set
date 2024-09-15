package com.company;
class Monkey{
    void jump(){
        System.out.println("Jumping !");
    }

    void bite(){
        System.out.println("Bite !");
    }
}

interface BasicAnimal{
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Eating a lot !");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep Well !");
    }
}

public class Chw_52_exeSol3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.bite();
        human.eat();

        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();

        BasicAnimal basicAnimal = new Human();
        basicAnimal.sleep();
        basicAnimal.eat();
    }
}
