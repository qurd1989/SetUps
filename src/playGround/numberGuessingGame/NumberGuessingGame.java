package playGround.numberGuessingGame;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        RandomNumber randomNumber = new RandomNumber();
        GameDifficulty gameDifficulty = new GameDifficulty();
        PrintMessage printMessage = new PrintMessage();
        UserInputHandler userInputHandler = new UserInputHandler(scanner);
        GuessTracker guessTracker = new GuessTracker();
        boolean playAgain = true;
        while (playAgain) {
            int number = randomNumber.generateRandomNumber();
            printMessage.printMessage("Choose difficulty level: easy / medium / hard");
            String difficulty = scanner.next();
            int guess = gameDifficulty.getGameDifficulty(difficulty);
            printMessage.printWelcomeMessage();
            while(guess > 0) {
                guessTracker.printGuessesLeft(guess);
                int userGuess = userInputHandler.GetUserGuess();
                if (userGuess == number) {
                    printMessage.printMessage("Congratulations! You guessed the number.");
                    break;
                } else if (userGuess < number) {
                    printMessage.printMessage("The number is greater than " + userGuess);
                } else {
                    printMessage.printMessage("The number is less than " + userGuess);
                }
                guess--;
            }
            if (guess == 0) {
                printMessage.printMessage("You have run out of guesses. The number was " + number);
            }
            System.out.println("Do you want to play again? (yes/no)");
            String tryAgain = scanner.next();
            if (!tryAgain.equalsIgnoreCase("yes")) {
               playAgain = false;
            } else {
                System.out.println("Thank you for playing!");
            }

        }
            scanner.close();

    }
}