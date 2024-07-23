package Challenge13to29;

public class SumOdd {
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }

        if(number%2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end < start)||(start <= 0)||(end <= 0)) {
            return -1;
        }
        for (int number = start; number <= end; number++){
            if(isOdd(number)){
                sum +=number;
            }
        }
        return sum;
    }
}
