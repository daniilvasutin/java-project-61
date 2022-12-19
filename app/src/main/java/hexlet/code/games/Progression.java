package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static final String GAME_REQUIRE = "What number is missing in the progression?";
    private static final int MAX_START_OF_PROGRASSION = 100;
    private static final int MAX_VALUE_FOR_RANDOM_STEP = 10;
    private static final int PROGRASSION_LENGTH = 10;

    public static void runGameProgression() {
        String[][] gameDate = new String[Engine.MAX_WINS][2];
        int firstNumberOfProgression;
        int stepOfProgression;
        int randomIndexForHideNumberInPrograssion;
        int[] prograssionArray = new int[PROGRASSION_LENGTH];
        String[] prograssionArrayWithHideNumber = new String[PROGRASSION_LENGTH];

        for (var i = 0; i < Engine.MAX_WINS; i++) {
            firstNumberOfProgression = Utils.getRandomNumberTo(MAX_START_OF_PROGRASSION);
            stepOfProgression = Utils.getRandomNumberTo(MAX_VALUE_FOR_RANDOM_STEP);

            prograssionArray[0] = firstNumberOfProgression;
            prograssionArrayWithHideNumber[0] = String.valueOf(firstNumberOfProgression);
            randomIndexForHideNumberInPrograssion = Utils.getRandomNumberTo(PROGRASSION_LENGTH);

            for (var j = 1; j < PROGRASSION_LENGTH; j++) {
                prograssionArray[j] = prograssionArray[j - 1] + stepOfProgression;
                prograssionArrayWithHideNumber[j] = String.valueOf(prograssionArray[j]);
            }

            prograssionArrayWithHideNumber[randomIndexForHideNumberInPrograssion] = "..";

            gameDate[i][0] = "Question: "
                    + Arrays.toString(prograssionArrayWithHideNumber);
            gameDate[i][1] =
                    String.valueOf(prograssionArray[randomIndexForHideNumberInPrograssion]);
        }

        Engine.startEngine(gameDate, GAME_REQUIRE);
    }

}
