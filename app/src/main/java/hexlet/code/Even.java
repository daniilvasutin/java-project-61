package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void runGameEven() {
        int number;
        var correctAnswerCounter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for(var i = 0; i < 3; i++) {
            number = Even.getRandom();
            System.out.println("Question " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if(number % 2 == 0) {
                if(userAnswer.equals("yes")) {
                    System.out.println("Correct!");
                    correctAnswerCounter++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    break;
                }
            } else {
                if(userAnswer.equals("no")) {
                    System.out.println("Correct!");
                    correctAnswerCounter++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    break;
                }
            }
        }
        if(correctAnswerCounter == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        } else {
            System.out.println("Ups, you not win " + Cli.getUserName() + "!");
        }
    }
    private static int getRandom(){
        return (int)(Math.random() * 100);
    }
}
