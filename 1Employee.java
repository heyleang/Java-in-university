public class Employee {
    private String name;
    private int id;
    private String position;
    private double salary;
    // Constructor
    public Employee(String name, int id, String position, double salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
    }
    // Method to give a raise
    public void giveRaise(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
    }
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
    }
    // Main method
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 101, "Software Engineer", 60000.0);
        // Display employee details
        employee.displayDetails();
    }
}
