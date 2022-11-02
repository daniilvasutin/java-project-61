package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int greetingButton = 1;
        final int evenGameButton = 2;
        final int calcGameButton = 3;
        final int gcdGameButton = 4;
        final int progressionGameButton = 5;
        final int primeGameButton = 6;
        final int exitButton = 0;


        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        System.out.println("Your choice: " + selectedGame);
        int selectedGameInt = Integer.parseInt(selectedGame);
        Cli.greeting();


        switch (selectedGameInt) {
            case greetingButton: break;
            case evenGameButton: GameEven.inizializeEvenGame(); break;
            case calcGameButton: GameCalc.inizializeCalcGame(); break;
            case gcdGameButton: GameGCD.inizializeGCDGame(); break;
            case progressionGameButton: GameProgression.initializeProgressionGame(); break;
            case primeGameButton: GamePrime.initializePrimeGame(); break;
            case exitButton: System.out.println("Byby"); break;
            default: break;
        }

    }
}
