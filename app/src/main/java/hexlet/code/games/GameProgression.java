package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Arrays;

public class GameProgression {
    public static final String GAME_REQUIRE = "What number is missing in the progression?";
    private static final int MAX_START_OF_PROGRASSION = 100;
    private static final int MAX_VALUE_FOR_RANDOM_STEP = 10;
    private static final int PROGRASSION_LENGTH = 10;

    public static void initializeProgressionGame() {
        String[][] gameDate = new String[GameEngine.MAX_WINS][2];
        int firstNumberOfProgression;
        int stepOfProgression;
        int randomIndexForHideNumberInPrograssion;
        int[] prograssionArray = new int[PROGRASSION_LENGTH];
        String[] prograssionArrayWithHideNumber = new String[PROGRASSION_LENGTH];

        for (var i = 0; i < GameEngine.MAX_WINS; i++) {
            firstNumberOfProgression = GameEngine.getRandomNumberTo(MAX_START_OF_PROGRASSION);
            stepOfProgression = GameEngine.getRandomNumberTo(MAX_VALUE_FOR_RANDOM_STEP);

            prograssionArray[0] = firstNumberOfProgression;
            prograssionArrayWithHideNumber[0] = String.valueOf(firstNumberOfProgression);
            randomIndexForHideNumberInPrograssion = GameEngine.getRandomNumberTo(PROGRASSION_LENGTH);

            for (var j = 1; j < PROGRASSION_LENGTH; j++) {
                prograssionArray[j] = prograssionArray[j - 1] + stepOfProgression;
                prograssionArrayWithHideNumber[j] = String.valueOf(prograssionArray[j]);
            }

            prograssionArrayWithHideNumber[randomIndexForHideNumberInPrograssion] = "..";

            gameDate[i][GameEngine.QUESTION_POSITION_IN_ARRAY] = "Question: "
                    + Arrays.toString(prograssionArrayWithHideNumber);
            gameDate[i][GameEngine.ANSWER_POSITION_IN_ARRAY] =
                    String.valueOf(prograssionArray[randomIndexForHideNumberInPrograssion]);
        }

        GameEngine.startEngine(gameDate, GAME_REQUIRE);
    }
}
