package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEngine {

    public static final int MAX_WINS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    private static int countOfWins = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int getRandomNumberTo(int range) {

        Random r = new Random();
        return r.nextInt(range);
    }

    public static void startEngine(String[][] gameDate, String gameRequire) {
        String userAnswer;
        String savedAnswer;

        System.out.println(gameRequire);

        for (var i = 0; i < MAX_WINS; i++) {
            System.out.println(gameDate[i][QUESTION]);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            savedAnswer = gameDate[i][ANSWER];

            if (userAnswer.equals(savedAnswer)) {
                countOfWins++;
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + savedAnswer + ".");
                System.out.println("Let's try again " + Cli.userName);
                break;
            }
        }
        if (countOfWins == 3) {
            System.out.println("Congratulations, " + Cli.userName);
        }
    }
}
