
public class Mainn {
    public static void main(String[] args) {
    // Instantiate objects
    Employee employee = new Employee("John Doe", "IT", 50000);
    Manager manager = new Manager ("Alice Smith", "Marketing", 70000, "Marketing Team");
    SalesPerson salesperson = new SalesPerson("Bob Johnson", "Sales", 60000, 100000);
    // Invoke the work() method on each object
    employee.work();
    manager.work();
    salesperson.work();
    }
}