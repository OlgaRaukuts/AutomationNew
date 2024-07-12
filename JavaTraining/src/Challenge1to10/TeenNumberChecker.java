package Challenge1to10;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){

        if((a>=13 && a <=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
            System.out.println("is teen");
            return true;
        }else {
            System.out.println(" is not a teen");
            return false;
        }
    }
}
