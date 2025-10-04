package oop.polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
        var car1 = Car.getCar("H", "Toyota Prius", 25.0, 8, 4);
        useCar(car1);

        var car2 = Car.getCar("E", "Tesla Model 3", 30.0, 10, 0);
        useCar(car2);
        var car3 = Car.getCar("G", "Ford Mustang", 15.0, 0, 8);
        useCar(car3);


    }

    private static void useCar(Car car1) {
        if (car1 instanceof HybridCar hybridCar) {
            hybridCar.startEngine();
            hybridCar.runEngine();
            hybridCar.drive();
        } else if (car1 instanceof ElectricCar electricCar) {
            electricCar.startEngine();
            electricCar.runEngine();
            electricCar.drive();
        } else if (car1 instanceof GasPoweredCar gasPoweredCar) {
            gasPoweredCar.startEngine();
            gasPoweredCar.runEngine();
            gasPoweredCar.drive();
        }
    }
}
