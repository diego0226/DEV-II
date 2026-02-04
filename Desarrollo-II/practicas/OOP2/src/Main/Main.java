package Main;

import model.Department;
import model.Employee;
import model.FullTimeEmployee;
import model.Manager;

public class Main {
    public static void main(String[] args) {
        Employee p1 = new FullTimeEmployee(10, "Diego", 1000, Department.FINANCE);
        Employee p2 = new Manager(764, "Andres", 1500, Department.HR, 600);

        System.out.println(p1.calculateSalary());
        System.out.println(p2.calculateSalary());

        ((Manager)p2).applyBonus(300);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        
    }

}
