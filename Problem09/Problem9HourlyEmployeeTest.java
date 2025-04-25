// Problem9HourlyEmployeeTest.java
public class Problem9HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployeeV2 he1 = new HourlyEmployeeV2("John", "Doe", "123-45-6789", 15.50, 40);  // Regular hours
        HourlyEmployeeV2 he2 = new HourlyEmployeeV2("Jane", "Smith", "987-65-4321", 20.00, 45);  // Overtime

        System.out.println(he1);
        System.out.println("---------------------------");
        System.out.println(he2);
    }
}
