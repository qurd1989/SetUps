package playGround.numberGuessingGame;

public class RandomNumber {

    public int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
