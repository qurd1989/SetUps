package playGround.numberGuessingGame;

import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;
    public UserInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }
    public int GetUserGuess() {
        int guess;
        while (true) {
            System.out.println("Enter a number between 1 and 100: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 100) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
        return guess;
    }
}