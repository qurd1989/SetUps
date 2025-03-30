package playGround.numberGuessingGame;

public class PrintMessage {

    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printWelcomeMessage() {
        System.out.println("Welcome to the Number Guessing Game!");
    }
    public void printErrorMessage() {
        System.out.println("Invalid difficulty level.Defaulting to medium.");
    }
}
