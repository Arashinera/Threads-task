package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static int choice;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            do {
                System.out.println("""
                        Choose opinion :
                        1) HomeWork Thread
                        2) Alternate Thread
                        0) Exit
                        Your opinion:\s""");
                choice = input.nextInt();
            } while (choice < 0 || choice > 2);
        } catch (InputMismatchException exception) {
            System.out.println("Your input is wrong. Please, try again...");
        }

        if (choice == 1 || choice == 2) {
            ThreadRun.ThreadSolution();
        } else {
            System.exit(0);
        }
    }
}
