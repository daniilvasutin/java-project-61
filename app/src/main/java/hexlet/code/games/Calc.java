package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void runCalc() {
        var correctAnswerCounter = 0;

        int firstNumber = 0;
        int secondNubmer = 0;

        Random random = new Random();
        char operatorArray[] = {'+', '-', '*'};
        int operator = 0;

        Scanner scanner = new Scanner(System.in);
        var result = 0;

        for(var i = 0; i < 3; i++) {
            firstNumber = (int)(Math.random() * 10);
            secondNubmer = (int)(Math.random() * 10);
            operator = random.nextInt(operatorArray.length);

            System.out.println("Question " + firstNumber + " " + operatorArray[operator] + " " + secondNubmer);
            String userAnswer = scanner.next();
            int userAnswerInt = Integer.parseInt(userAnswer);

            switch (operatorArray[operator]) {
                case '+': result = firstNumber + secondNubmer;
                break;
                case '-': result = firstNumber - secondNubmer;
                break;
                case '*': result = firstNumber * secondNubmer;
                break;
            }
            if(result == userAnswerInt) {
                correctAnswerCounter++;
            }else {
                System.out.println("It's wrong");
                break;
            }
        }
        if(correctAnswerCounter == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        } else {
            System.out.println("Ups, you not win " + Cli.getUserName() + "!");
        }

    }
}
