public class Employee2 {
    public static void main(String[] args) {
        // Create another Employee object
        Employee employeeapp2 = new Employee("Alice Smith", 102, "Project Manager", 80000.0);
        
        // Display initial details
        System.out.println("Before Raise:");
        employeeapp2.displayDetails();
        
        // Give a raise of 8%
        employeeapp2.giveRaise(8);
        
        // Display details after the raise
        System.out.println("\nAfter Raise:");
        employeeapp2.displayDetails();
    }
}
