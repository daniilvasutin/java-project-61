package hexlet.code.games;

import hexlet.code.GameEngine;

public class GamePrime {

    public static final String GAME_REQUIRE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_VALUE_FOR_RANDOM = 1;
    private static final int MAX_VALUE_FOR_RANDOM = 100;

    public static void initializePrimeGame() {
        String[][] gameDate = new String[GameEngine.MAX_WINS][2];
        int randomNumber;

        for (var i = 0; i < GameEngine.MAX_WINS; i++) {
            randomNumber = GameEngine.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);

            gameDate[i][GameEngine.QUESTION_POSITION_IN_ARRAY] = "Question: " + randomNumber;
            gameDate[i][GameEngine.ANSWER_POSITION_IN_ARRAY] = isPrime(randomNumber);
        }

        GameEngine.startEngine(gameDate, GAME_REQUIRE);

    }

    private static String isPrime(int number) {
        String checkStr = "yes";

        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                checkStr = "no";
                break;
            }
        }

        return checkStr;
    }
}
