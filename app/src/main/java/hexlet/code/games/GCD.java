package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String GAME_REQUIRE = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE_FOR_RANDOM = 1;
    private static final int MAX_VALUE_FOR_RANDOM = 100;

    public static void runGameGCD() {
        String[][] gameDate = new String[Engine.MAX_WINS][2];
        int firstNumber;
        int secondNumber;

        for (var i = 0; i < Engine.MAX_WINS; i++) {
            firstNumber = Utils.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);
            secondNumber = Utils.getRandomNumberInRange(MIN_VALUE_FOR_RANDOM, MAX_VALUE_FOR_RANDOM);

            gameDate[i][0] = Engine.question() + firstNumber + " " + secondNumber;
            gameDate[i][1] = String.valueOf(findGCD(firstNumber, secondNumber));
        }

        Engine.startEngine(gameDate, GAME_REQUIRE);
    }

    private static int findGCD(int firstNumber, int secondNumber) {
        int gcd = Math.min(firstNumber, secondNumber);

        for (int i = gcd; i >= 1; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}
