package challenges;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid number");
        }
        for (int i=1; i<number+1; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
