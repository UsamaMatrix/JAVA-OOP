// Superclass: Employee
class Employee {
    String name;
    int baseSalary;

    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void displayInfo() {
        System.out.println("Employee: " + name);
    }

    int calculateSalary() {
        return baseSalary;
    }
}

class Developer extends Employee {
    int bonus;

    Developer(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    int calculateSalary() {
        return baseSalary + bonus;
    }
}

class Manager extends Employee {
    int allowance;

    Manager(String name, int baseSalary, int allowance) {
        super(name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    int calculateSalary() {
        return baseSalary + allowance;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Developer dev = new Developer("Ali", 50000, 10000);
        Manager mgr = new Manager("Sara", 70000, 15000);

        dev.displayInfo();
        System.out.println("Developer Salary: " + dev.calculateSalary());

        System.out.println();

        mgr.displayInfo();
        System.out.println("Manager Salary: " + mgr.calculateSalary());
    }
}
