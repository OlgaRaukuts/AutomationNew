package challenges;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        if((int)(a * 1000) == (int)(b * 1000) ){
            System.out.println("good");
            return true;
        }else{
            System.out.println("bad");
            return false;
        }
    }
}
