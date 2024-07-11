import Challenge1to10.MethodChallenge;
import Challenge1to10.PositiveNegativeZero;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int highScorePosition = MethodChallenge.calculateHighScorePosition(1500);
        MethodChallenge.displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = MethodChallenge.calculateHighScorePosition(1000);
        MethodChallenge.displayHighScorePosition("Jane", highScorePosition);
        highScorePosition = MethodChallenge.calculateHighScorePosition(500);
        MethodChallenge.displayHighScorePosition("James", highScorePosition);
        highScorePosition = MethodChallenge.calculateHighScorePosition(100);
        MethodChallenge.displayHighScorePosition("Teddy", highScorePosition);
        highScorePosition = MethodChallenge.calculateHighScorePosition(25);
        MethodChallenge.displayHighScorePosition("Wayne", highScorePosition);
    }
}