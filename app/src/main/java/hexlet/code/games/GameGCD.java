package hexlet.code.games;

import hexlet.code.GameEngine;

public class GameGCD {

    public static final String GAME_REQUIRE = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE_FOR_RANDOM = 1;
    private static final int MAX_VALUE_FOR_RANDOM = 100;

    public static void createDateForGCD() {
        String[][] gameDate = new String[GameEngine.MAX_WINS][2];
        int firstNumber;
        int secondNumber;

        for (var i = 0; i < GameEngine.MAX_WINS; i++) {
            firstNumber = GameEngine.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);
            secondNumber = GameEngine.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);

            gameDate[i][GameEngine.QUESTION] = "Question: " + firstNumber + " " + secondNumber;
            gameDate[i][GameEngine.ANSWER] = findeGCD(firstNumber, secondNumber);
        }

        GameEngine.startEngine(gameDate, GAME_REQUIRE);
    }

    private static String findeGCD(int firstNumber, int secondNumber) {
        int GCD = Math.min(firstNumber, secondNumber);

        for ( int i = GCD; i >= 1; i--){
            if (firstNumber % i == 0 && secondNumber % i == 0){
                GCD = i;
                break;
            }
        }

        return String.valueOf(GCD);
    }
}
