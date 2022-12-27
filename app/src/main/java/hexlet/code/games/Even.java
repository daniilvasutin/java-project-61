package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String GAME_REQUIRE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANGE_OF_RANDOM = 100;
    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    public static void runGameEven() {
        String[][] gameDate = new String[Engine.MAX_WINS][2];
        int randomNumber;

        for (var i = 0; i < Engine.MAX_WINS; i++) {
            randomNumber = Utils.getRandomNumberTo(MAX_RANGE_OF_RANDOM);

            gameDate[i][0] =
                    Engine.question() + randomNumber;
            gameDate[i][1] = isEven(randomNumber) ? "yes" : "no";
        }

        Engine.startEngine(gameDate, GAME_REQUIRE);
    }

}
