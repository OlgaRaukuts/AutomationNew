package challenges;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car --> Start engine");
    }
    protected void runEngine(){
        System.out.println("Car --> Run engine");
    }
    public void drive(){
        System.out.println("Car --> Start driving " + getClass().getSimpleName());
        runEngine();
    }

    public static class GasPoweredCar extends Car{
        private double avgKmPerLitre;
        private int cylinders = 6;

        public GasPoweredCar(String description) {
            super(description);
        }

        public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
            super(description);
            this.avgKmPerLitre = avgKmPerLitre;
            this.cylinders = cylinders;
        }
    }

    public static class ElectricCar extends Car{
        private double avgKmPerCharge;
        private int batterySize;

        public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
            super(description);
            this.avgKmPerCharge = avgKmPerCharge;
            this.batterySize = batterySize;
        }
    }
    public static class HybridCar extends Car{
        private double avgKmPerLitre;
        private int batterySize;
        private int cylinders;

        public HybridCar(String description, double avgKmPerLitre,int batterySize, int cylinders) {
            super(description);
            this.avgKmPerLitre = avgKmPerLitre;
            this.batterySize = batterySize;
            this.cylinders = cylinders;
        }
    }
}
