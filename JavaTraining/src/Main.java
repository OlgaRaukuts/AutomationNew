
import Challenge13to29.NumberInWord;
import Challenge13to29.NumberOfDaysInMonth;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int countOfNumbers = 0;
        int sumOfNumbers = 0;

       for(int number = 1; number <=1000; number++){
           if((number%3 ==0) && (number%5 == 0)){
               countOfNumbers++;
               sumOfNumbers += number;
               System.out.println("Found a match " + number);

               if(countOfNumbers ==5){
                   break;
               }
           }
           System.out.println("Sum is " + sumOfNumbers);
       }

    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount* (interestRate/100));
    }
}