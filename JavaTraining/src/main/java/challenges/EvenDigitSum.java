package challenges;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int evenNumber = 0;

        while (number > 0){
            evenNumber = number%10;
            if(evenNumber%2 == 0){
                sum += evenNumber;
            }
            number/=10;
        }
        return sum;
    }
}
