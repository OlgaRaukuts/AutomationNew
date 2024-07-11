package Challenge1to10;

public class MethodChallenge {

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000){
            position = 1;
        } else if (score>=500) {
            position = 2;
        }else if(score >=100){
            position = 3;
        }
        return position;
    }
}
