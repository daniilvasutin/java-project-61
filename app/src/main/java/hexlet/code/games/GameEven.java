package hexlet.code.games;

import hexlet.code.GameEngine;

public class GameEven {
    public static final String GAME_REQUIRE = "Answer 'yes' if the number is even, otherwise answer 'no'";

    public static String isEven(int randomNumber) {
        if(randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void runGameEven() {
        String[][] gameDate = new String[GameEngine.MAX_WINS][2];
        int randomNumber;

        for (var i = 0; i < GameEngine.MAX_WINS; i++) {
            randomNumber = GameEngine.getRandomNumberTo(100);

            gameDate[i][GameEngine.QUESTION] = "Question: " + randomNumber;
            gameDate[i][GameEngine.ANSWER] = isEven(randomNumber);
        }

        GameEngine.startEngine(gameDate, GAME_REQUIRE);
    }

}
