package playGround.numberGuessingGame;

public class GameDifficulty {

    public int getGameDifficulty(String gameDifficulty) {

        switch (gameDifficulty) {
            case"1":
            case "easy":
                return 8;
            case "2":
            case "medium":
                return 6;
            case "3":
            case "hard":
                return  4;

            default:
                System.out.println("Invalid difficulty level.Defaulting to medium.");
                return  6;

        }
    }
}
