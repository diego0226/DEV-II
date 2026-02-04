package model;

public class FullTimeEmployee extends Employee{
    private Department department;
    

    public FullTimeEmployee(int id, String name, double baseSalary, Department department) {
        super(id, name, baseSalary);
        this.department = department;
    }


    public FullTimeEmployee() {
        this(0, "none", 0, null);
    }
    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " Department: " + department;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}
