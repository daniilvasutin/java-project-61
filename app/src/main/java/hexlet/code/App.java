package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {

    public static final int GREETING = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;
    public static final int EXIT = 0;
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int selectedGame = scanner.nextInt();
        System.out.println("Your choice: " + selectedGame);

        switch (selectedGame) {
            case GREETING -> Cli.greeting();
            case EVEN_GAME -> Even.runGameEven();
            case CALC_GAME -> Calc.runGameCalc();
            case GCD_GAME -> GCD.runGameGCD();
            case PROGRESSION_GAME -> Progression.runGameProgression();
            case PRIME_GAME -> Prime.runGamePrime();
            case EXIT -> System.out.println("Byby");
            default -> throw new IllegalStateException("Unexpected value: " + selectedGame);
        }
    }
}
