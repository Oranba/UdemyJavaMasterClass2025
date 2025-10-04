package oop.polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("2022 Blue Ferrari 296 GTS");
//        runRace(car);
//
//        Car ferrari = new GasPoweredCar("2022 Red Ferrari 296 GTS", 15.4, 6);
//        runRace(ferrari);
//

        var toyotaPerius = Car.getCar("H", "Toyota Prius", 25.0, 8, 4);
        runRace(toyotaPerius);
//        useCar(car1);
//
        var tesla3 = Car.getCar("E", "Tesla Model 3", 30.0, 10, 0);
        runRace(tesla3);
//        useCar(car2);

        var mustang = Car.getCar("G", "Ford Mustang", 15.0, 0, 8);
        runRace(mustang);
//        useCar(car3);


    }

    public static void runRace(Car car) {
        car.startEngine();
        car.runEngine();
        car.drive();
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
