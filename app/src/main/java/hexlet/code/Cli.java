package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName = "";
    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        //scanner.close();
    }

    public static String getUserName() {
        return userName;
    }
}
