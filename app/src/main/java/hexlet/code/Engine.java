package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_WINS = 3;

    public static void startEngine(String[][] gameData, String description) {

        Cli.greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);

        for (var i = 0; i < gameData.length; i++) {
            System.out.println(gameData[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            String savedAnswer = gameData[i][1];

            if (userAnswer.equals(savedAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + savedAnswer + ".");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static String question() {
        return "Question: ";
    }
}
