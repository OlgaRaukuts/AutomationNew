package Challenge1to10;

public class PositiveNegativeZero {
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("It's positive");
        }else if (number < 0) {
            System.out.println("It's negative");
        }else if (number == 0){
            System.out.println("It's zero");
        }
    }
}
