package model;

public abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public Employee() {
        this(0, "none", 0);
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id = " + id + ", name = "+ name + ", baseSalary = $" + baseSalary + "}";
    }

    public void work() {
        System.out.println("The employee is working");
    }

    public abstract double calculateSalary();

}
