// File: CommissionEmployee.java
public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
                              String ssn, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.socialSecurityNumber = ssn;
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double sales) {
        if (sales < 0.0) throw new IllegalArgumentException("Gross sales must be >= 0");
        this.grossSales = sales;
    }

    public void setCommissionRate(double rate) {
        if (rate <= 0.0 || rate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        this.commissionRate = rate;
    }

    public String getFirstName()       { return firstName; }
    public String getLastName()        { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public double getGrossSales()      { return grossSales; }
    public double getCommissionRate()  { return commissionRate; }

    public double earnings() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return String.format(
                "%s %s%nsocial security number: %s%ngross sales: %.2f%ncommission rate: %.2f",
                firstName, lastName, socialSecurityNumber, grossSales, commissionRate
        );
    }
}
