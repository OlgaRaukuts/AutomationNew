package Challenge1to10;

public class EqualityPrinter {
    public static void printEqual(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        } else if (a == c && b == c && a==b) {
            System.out.println("All numbers are equal");
        }else if(a!=b && a!=c && b!=c) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

}
