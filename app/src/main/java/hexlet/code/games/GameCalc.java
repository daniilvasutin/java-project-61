package hexlet.code.games;

import hexlet.code.GameEngine;

public class GameCalc {

    private static final char OPERATOR_ARRAY[] = {'+', '-', '*'};
    private static final int OPERATOR_ARRAY_LENGTH = OPERATOR_ARRAY.length;
    private static final int MAX_VALUE_FOR_RANDOM = 10;
    private static char operator;

    public static final String GAME_REQUIRE = "What is the result of the expression?";


    public static String calculateWithRandomOperator(int firstNumber, int secondNumber, char operator) {
        var result = 0;


        switch (operator) {
            case '+': result = firstNumber + secondNumber;
                break;
            case '-': result = firstNumber - secondNumber;
                break;
            case '*': result = firstNumber * secondNumber;
                break;
        }

        return String.valueOf(result);
    }

    public static void GameCalculator() {
        String[][] gameDate = new String[GameEngine.MAX_WINS][2];
        char operator;
        int firstNumber;
        int secondNumber;

        for (var i = 0; i < GameEngine.MAX_WINS; i++) {
            firstNumber = GameEngine.getRandomNumberTo(MAX_VALUE_FOR_RANDOM);
            secondNumber = GameEngine.getRandomNumberTo(MAX_VALUE_FOR_RANDOM);
            operator = OPERATOR_ARRAY[GameEngine.getRandomNumberTo(OPERATOR_ARRAY_LENGTH)];

            gameDate[i][GameEngine.QUESTION] = "Question: " + firstNumber + " " + operator + " " + secondNumber;
            gameDate[i][GameEngine.ANSWER] = calculateWithRandomOperator(firstNumber, secondNumber, operator);
        }

        GameEngine.startEngine(gameDate, GAME_REQUIRE);
    }

}
