public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void work() {
        System.out.println(name + " is working.");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Ly Menghong", "Engineering", 10000);
        employee.work();
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee department: " + employee.getDepartment());
        System.out.println("Employee salary: " + employee.getSalary());
        employee.setName("Mang Chhunleang");
        employee.setDepartment("Software engineering");
        employee.setSalary(30000);
        System.out.println("Modified employee name: " + employee.getName());
        System.out.println("Modified employee department: " + employee.getDepartment());
        System.out.println("Modified employee salary: " + employee.getSalary());
    }
}
