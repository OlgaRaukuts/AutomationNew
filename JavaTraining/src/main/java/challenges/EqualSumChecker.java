package challenges;

public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        if(a+b == c){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }
}
