package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int MAX_VALUE_FOR_RANDOM = 10;

    public static final String GAME_REQUIRE = "What is the result of the expression?";


    public static int calculate(int firstNumber, int secondNumber, char operator) {

        return switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new Error("Unknown order state: '${operator}'!");
        };
    }

    public static void runGameCalc() {
        String[][] gameDate = new String[Engine.MAX_WINS][2];

        for (var i = 0; i < Engine.MAX_WINS; i++) {

            String[] questionAnswer = generateQuestionAnswer();
            gameDate[i][0] = questionAnswer[0];
            gameDate[i][1] = questionAnswer[1];
        }

        Engine.startEngine(gameDate, GAME_REQUIRE);
    }

    private static String[] generateQuestionAnswer(){
        int firstNumber = Utils.getRandomNumberTo(MAX_VALUE_FOR_RANDOM);
        int secondNumber = Utils.getRandomNumberTo(MAX_VALUE_FOR_RANDOM);
        char operator = OPERATORS[Utils.getRandomNumberTo(OPERATORS.length)];

        String[] questionAnswer = new String[2];
        questionAnswer[0] = "Question: "
                + firstNumber + " "
                + operator + " "
                + secondNumber;
        questionAnswer[1] = String.valueOf(calculate(firstNumber, secondNumber, operator));

        return questionAnswer;
    }

}
