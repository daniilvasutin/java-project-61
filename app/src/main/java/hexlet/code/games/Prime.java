package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String GAME_REQUIRE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_VALUE_FOR_RANDOM = 1;
    private static final int MAX_VALUE_FOR_RANDOM = 100;

    public static void runGamePrime() {
        String[][] gameDate = new String[Engine.MAX_WINS][2];
        int randomNumber;

        for (var i = 0; i < Engine.MAX_WINS; i++) {
            randomNumber = Utils.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);

            gameDate[i][0] = Engine.question() + randomNumber;
            gameDate[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }

        Engine.startEngine(gameDate, GAME_REQUIRE);

    }

    private static boolean isPrime(int number) {
        boolean checkStr = true;

        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                checkStr = false;
                break;
            }
        }

        return checkStr;
    }
}
