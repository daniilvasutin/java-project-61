package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        System.out.println("Your choice: " + selectedGame);
        //int selectedGameInt = Integer.parseInt(selectedGame);

        //Engine game = new Engine(selectedGameInt);


        if(selectedGame.equals("1")) {
            Cli.greeting();
        }
        if(selectedGame.equals("2")) {
            Cli.greeting();
            Even.runGameEven();
        }
        if(selectedGame.equals("3")) {
            Cli.greeting();
            Calc.runCalc();
        }
        if(selectedGame.equals("0")) {
            System.out.println("Byby");
        }
    }
}
