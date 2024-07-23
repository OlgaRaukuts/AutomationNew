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

        if(month <1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        int days = 0;
        switch (month){
            case 1 : case 3: case 5: case 7: case 8: case 10 : case 12:
                days= 31;
                break;
            case 2:
                if(isLeapYear(year)){
                    days = 29;
                    break;
                }
                days=28;
                break;
            case 4: case 6: case 9 : case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;

        }
        return days;
    }
}
