package hexlet.code.games;

import hexlet.code.GameEngine;

public class GameGCD {

    public static final String GAME_REQUIRE = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE_FOR_RANDOM = 1;
    private static final int MAX_VALUE_FOR_RANDOM = 100;

    public static void inizializeGCDGame() {
        String[][] gameDate = new String[GameEngine.MAX_WINS][2];
        int firstNumber;
        int secondNumber;

        for (var i = 0; i < GameEngine.MAX_WINS; i++) {
            firstNumber = GameEngine.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);
            secondNumber = GameEngine.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);

            gameDate[i][GameEngine.QUESTION_POSITION_IN_ARRAY] = "Question: " + firstNumber + " " + secondNumber;
            gameDate[i][GameEngine.ANSWER_POSITION_IN_ARRAY] = findeGCD(firstNumber, secondNumber);
        }

        GameEngine.startEngine(gameDate, GAME_REQUIRE);
    }

    private static String findeGCD(int firstNumber, int secondNumber) {
        int gcd = Math.min(firstNumber, secondNumber);

        for (int i = gcd; i >= 1; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
                break;
            }
        }

        return String.valueOf(gcd);
    }
}
