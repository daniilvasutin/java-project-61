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
        String[][] gameData = new String[Engine.MAX_WINS][2];

        for (var i = 0; i < Engine.MAX_WINS; i++) {
            int firstNumberOfProgression = Utils.getRandomNumberTo(MAX_START_OF_PROGRASSION);
            int stepOfProgression = Utils.getRandomNumberInRange(1, MAX_VALUE_FOR_RANDOM_STEP);
            int randomIndexForHideNumberInProgression = Utils.getRandomNumberTo(PROGRASSION_LENGTH);

            int[] progression = generateProgression(firstNumberOfProgression, stepOfProgression, PROGRASSION_LENGTH);

            String[] progressionWithHideNumber = new String[PROGRASSION_LENGTH];
            for (var j = 0; j < PROGRASSION_LENGTH; j++) {
                progressionWithHideNumber[j] = String.valueOf(progression[j]);
            }
            progressionWithHideNumber[randomIndexForHideNumberInProgression] = "..";

            gameData[i][0] = Engine.question()
                    + Arrays.toString(progressionWithHideNumber).replaceAll("[\\[,\\]]", "");
            gameData[i][1] =
                    String.valueOf(progression[randomIndexForHideNumberInProgression]);
        }

        Engine.startEngine(gameData, GAME_REQUIRE);
    }

    private static int[] generateProgression(int firstNumberOfProgression,
                                             int stepOfProgression,
                                             int progressionLength) {
        int[] progressionArray = new int[progressionLength];
        progressionArray[0] = firstNumberOfProgression;

        for (var i = 1; i < progressionLength; i++) {
            progressionArray[i] = progressionArray[i - 1] + stepOfProgression;
        }

        return progressionArray;
    }



}
