import challenges.EvenDigitSum;
import challenges.FirstLastDigitSum;
import challenges.NumberPalindrome;

public class Main {
    public static void main(String[] args) {
      //  System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(7768));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));

    }
    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number){
        int sum = 0;
        if (number > 0){
            while (number > 9){
                sum += number % 10;
                number = number/10;
            }

            sum += number;
            return sum;
        }else{
            return -1;
        }
    }
}
