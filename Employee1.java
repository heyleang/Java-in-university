public class Employee1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employeeapp1 = new Employee("John Doe", 101, "Software Engineer", 60000.0);

        // Display initial details 
        System.out.println("Before Raise: ");
        employeeapp1.displayDetails();

        // Display details after the raise 
        System.out.println("\n After Raise: ");
        employeeapp1.displayDetails();
    }
}