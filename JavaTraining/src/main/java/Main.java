public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 24;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number is " + number);
        }


    }
    public static boolean isEvenNumber(int number){

        if((number % 2) == 0){
            return true;
        }else {
            return false;
        }
    }
}
