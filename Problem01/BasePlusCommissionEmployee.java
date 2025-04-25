// File: BasePlusCommissionEmployee.java
public class BasePlusCommissionEmployee {
    private CommissionEmployee employee;
    private double baseSalary;

    public BasePlusCommissionEmployee(CommissionEmployee emp, double baseSalary) {
        this.employee = emp;
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double salary) {
        if (salary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0");
        this.baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + employee.earnings();
    }

    public String toString() {
        return String.format(
                "%s%nbase salary: %.2f",
                employee.toString(), baseSalary
        );
    }

    public static void main(String[] args) {
        CommissionEmployee ce = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, 0.06
        );

        BasePlusCommissionEmployee bpce =
                new BasePlusCommissionEmployee(ce, 300.00);

        System.out.println("CommissionEmployee details:");
        System.out.println(ce);

        System.out.println("\nBasePlusCommissionEmployee details (composition):");
        System.out.println(bpce);

        System.out.printf("%nEarnings: %.2f%n", bpce.earnings());
    }
}
