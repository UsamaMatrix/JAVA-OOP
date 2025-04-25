// HourlyEmployeeV2.java
public class HourlyEmployeeV2 extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployeeV2(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative.");
        }
        this.hours = hours;
    }

    public double earnings() {
        if (hours <= 40) {
            return wage * hours;  // Regular hours
        } else {
            double regularPay = wage * 40;  // Pay for the first 40 hours
            double overtimePay = (hours - 40) * (wage * 1.5);  // Overtime pay
            return regularPay + overtimePay;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nWage: $%.2f%nHours Worked: %.2f%nEarnings: $%.2f",
                super.toString(), wage, hours, earnings());
    }
}
