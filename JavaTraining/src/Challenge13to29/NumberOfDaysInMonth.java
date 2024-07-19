package Challenge13to29;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        boolean leapYear;
        if(year <= 1 || year >=9999){
            return false;
        }else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
            leapYear = true;
        }else{
            leapYear = false;
        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year){

        
    }
}
