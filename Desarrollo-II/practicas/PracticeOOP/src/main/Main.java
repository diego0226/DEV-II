package main;

import model.Car;
import model.CarType;
import model.ElectricCar;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Pontiac", "Firebird", 1967, CarType.SPORTS);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model S", 2025, CarType.SEDAN, 83);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar)myElectricCar).chargeBattery();
        

        System.out.println("Car:" + myCar.toString() + "\n");
        
        System.out.println("Electric car: " + myElectricCar.toString());


    }
}
