package model;

public class Manager extends FullTimeEmployee implements BonusEligible{
    private double bonus;

    public Manager(int id, String name, double baseSalary, Department department, double bonus) {
        super(id, name, baseSalary, department);
        this.bonus = bonus;
    }

    public Manager(){
        this(0, "none", 0, null, 0);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "bonus: $" + bonus;
    }

    @Override
    public void applyBonus(double amount) {
        setBaseSalary(getBaseSalary() + amount);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
