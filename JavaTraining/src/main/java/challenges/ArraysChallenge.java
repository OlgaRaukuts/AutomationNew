package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysChallenge {
    static Random random = new Random();
    static Integer[] array = new Integer[10];
    public static void randomise(){

        for(int i = 0; i < array.length; i++ ){
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }
    }
    public static void sortArray(){

        for(int i = 0; i < array.length; i++){
            for (int j = array.length-1; j > i; j--){
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
            }
        }
        System.out.println(Arrays.toString(array));
            Arrays.sort(array, Collections.reverseOrder());
            System.out.println(Arrays.toString(array));
    }


}}
