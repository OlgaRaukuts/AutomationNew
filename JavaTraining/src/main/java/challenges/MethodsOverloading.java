package challenges;

public class MethodsOverloading {
    public static void convertToCentimeters (int heightInches){
        double centimeters = heightInches * 2.54;
        System.out.println(centimeters);

    }
    public static void convertToCentimeters (int heightFeet, int heightInches ){
        double feet = ((heightFeet *12) + heightInches)*2.54;
        System.out.println(feet);
    }
}
