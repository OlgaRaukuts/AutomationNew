package Challenge13to29;

public class DayOfWeek {
    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day){
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";

            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
}

public static void printWeekday(int day){
        if(day == 0){
            System.out.println(day + " stands for Sunday");
        } else if (day == 1) {
            System.out.println(day + " stands for Monday");
        } else if (day == 2) {
            System.out.println(day + " stands for Tuesday");
        } else if (day == 3) {
            System.out.println(day + " stands for Wednesday");
        } else if (day == 4) {
            System.out.println(day + " stands for Thursday");
        } else if (day == 5) {
            System.out.println(day + " stands for Friday");
        } else if (day == 6) {
            System.out.println(day + " stands for Saturday");
        }else {
            System.out.println("Invalid value");
        }
}
}
