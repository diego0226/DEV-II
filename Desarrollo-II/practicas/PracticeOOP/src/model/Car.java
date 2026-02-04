package model;

public class Car extends Vehicle{
    private CarType type;

    public Car(String brand, String model, int year, CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    public Car() {
        this("none", "none", 0, null);
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: " + type;
    }

    @Override
    public void start() {
        System.out.println("The car started");
    }

}
