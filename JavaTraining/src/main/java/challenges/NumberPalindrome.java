package challenges;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        if(number < 0){
            return true;
        }
        while (number>0){
            lastDigit = number%10;
            reverse = reverse*10 + lastDigit;
            number/=10;
        }


        if(number != reverse){
            return true;
        }else{
            return false;
        }


    }

}