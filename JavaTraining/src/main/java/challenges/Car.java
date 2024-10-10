package challenges;

public class Car {
    private String description;
    public void startEngine(){

    }
    public void drive(){

    }
    protected void runEngine(){

    }

    public static class GasPoweredCar extends Car{
        private double avgKmPerLitre;
        private int cylinders;
    }

    public static class ElectricCar extends Car{
        private double avgKmPerCharge;
        private int batterySize;
    }
    public static class HybridCar extends Car{
        private double avgKmPerLitre;
        private int batterySize;
        private int cylinders;
    }
}
