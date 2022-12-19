package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String GAME_REQUIRE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0 ? true : false;
    }

    public static void runGameEven() {
        String[][] gameDate = new String[Engine.MAX_WINS][2];
        int randomNumber;

        for (var i = 0; i < Engine.MAX_WINS; i++) {
            randomNumber = Utils.getRandomNumberTo(100);

            gameDate[i][0] = "Question: " + randomNumber;
            gameDate[i][1] = isEven(randomNumber) ? "yes" : "no";
        }

        Engine.startEngine(gameDate, GAME_REQUIRE);
    }

}
