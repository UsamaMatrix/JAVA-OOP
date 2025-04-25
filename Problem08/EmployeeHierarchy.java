// Superclass
class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nSSN: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}

// Commission-based employee
class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%nEarnings: $%.2f",
                super.toString(), grossSales, commissionRate, earnings());
    }
}

// Commission + base salary employee
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried %sBase Salary: $%.2f%nTotal Earnings: $%.2f",
                super.toString(), baseSalary, earnings());
    }
}

// Test class
public class EmployeeHierarchy {
    public static void main(String[] args) {
        CommissionEmployee ce = new CommissionEmployee("Alice", "Smith", "123-45-6789", 5000, 0.10);
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Bob", "Johnson", "987-65-4321", 7000, 0.08, 1000);

        System.out.println(ce);
        System.out.println("---------------------------");
        System.out.println(bpce);
    }
}
