package oop.polymorphism.challenge;

public class Car {
    String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Starting the engine");

    }

    public void drive() {
        System.out.println("Car -> Driving, type is: " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car -> Running the engine");
    }

    public static Car getCar(String type, String description, double avgKmPerLiterCharge, int batterySize, int cylinders) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'E' -> new ElectricCar(description, avgKmPerLiterCharge, batterySize);
            case 'G' -> new GasPoweredCar(description, avgKmPerLiterCharge, cylinders);
            case 'H' -> new HybridCar(description, avgKmPerLiterCharge, batterySize, cylinders);
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}

class HybridCar extends Car {
    double avgKmPerLiter;
    int batterySize;
    int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        System.out.println("Driving the hybrid car: " + description
                + ", AvgKmPerLiter: " + avgKmPerLiter + ", BatterySize: " + batterySize + ", Cylinders: " + cylinders);
    }
}

class ElectricCar extends Car {
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    double avgKmPerCharge;
    int batterySize;

    @Override
    public void drive() {
        System.out.println("Driving the electric car: " + description
                + ", AvgKmPerCharge: " + avgKmPerCharge + ", BatterySize: " + batterySize);
    }

}

class GasPoweredCar extends Car {
    double avgKmPerLiter;
    int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        System.out.println("Driving the gas powered car: " + description
                + ", AvgKmPerLiter: " + avgKmPerLiter + ", Cylinders: " + cylinders);
    }
}