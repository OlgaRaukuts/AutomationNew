package challenges;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int fistDigit = 0;
        int lastDigit = number %10;

        if (number < 0){
            return -1;
        }

        while (number >0 ){
            fistDigit = number%10;
            number /= 10;
        }
        return fistDigit + lastDigit;
    }
}
