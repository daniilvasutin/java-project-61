package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        System.out.println("Your choice: " + selectedGame);

        if(selectedGame.equals("1")) {
            Cli.greeting();
        }
        if(selectedGame.equals("2")) {
            Cli.greeting();
            Even.runGameEven();
        }
        if(selectedGame.equals("3")) {
            System.out.println("Baybay");
        }
    }
}
