package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputNumber;
    int numberOfGuess = 0;

    public int getNumberOfGuess() {
        return numberOfGuess;
    }

    public void setNumberOfGuess(int numberOfGuess) {
        this.numberOfGuess = numberOfGuess;
    }

    Game() {
        Random random = new Random();
        this.number = random.nextInt(100);
        System.out.println(number);
    }

    public void takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number ? ");
        inputNumber = scanner.nextInt();
    }

    public Boolean isCorrectNumber(){
        numberOfGuess++;
        if(inputNumber == number) {
            System.out.format("Yes, you guessed it right, it was %d\n You gussed it in %d attempt ! ",number,numberOfGuess);
            return true;
        } else if (inputNumber<number) {
            System.out.println("To less ");
        } else if (inputNumber>number) {
            System.out.println("To high");
        }
        return false;
    }

}

public class Chw_45_exeSol {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
        while(!b) {
            game.takeUserInput();
            b = game.isCorrectNumber();
        }

    }
}
