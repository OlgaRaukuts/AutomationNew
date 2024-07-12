package Challenge1to10;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if(year <=1 || year >= 9999) {
            System.out.println("This is not the leap year");
            return false;
        }else if ((year%4 == 0 && year%100 !=0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
            System.out.println("This is the leap year");
            return true;
        }else {
            System.out.println("something wrong");
            return false;
        }
    }
}
