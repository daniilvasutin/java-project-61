package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int Greeting = 1;
        final int EvenGame = 2;
        final int CalcGame = 3;
        final int GCDGame = 4;
        final int ProgressionGame = 5;
        final int Exit = 0;


        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        System.out.println("Your choice: " + selectedGame);
        int selectedGameInt = Integer.parseInt(selectedGame);
        Cli.greeting();


        switch (selectedGameInt) {
            case Greeting: break;
            case EvenGame: GameEven.runGameEven(); break;
            case CalcGame: GameCalc.GameCalculator(); break;
            case GCDGame: GameGCD.createDateForGCD(); break;
            case ProgressionGame: GameProgression.initializeProgressionGame(); break;
            case Exit: System.out.println("Byby"); break;
        }

    }
}
