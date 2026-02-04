package model;

public class ElectricCar extends Car implements IElectric{
    private int batteryLevel;

    

    

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar() {
        this("none", "none", 0, null, 0);
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "battery level: %" + batteryLevel;
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("The battery is 100% charged");
    }

    @Override
    public void start() {
        System.out.println("The electric car started");
    }

    
    

}
