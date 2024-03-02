public class Employee_class {
    public static void main(String[] args) {

        Employee employee = new Employee("Hong li", "Engineering", 10000);

        employee.work();

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee department: " + employee.getDepartment());
        System.out.println("Employee salary: " + employee.getSalary());

        employee.setName("Nith Pha");
        employee.setDepartment("Human Resources");
        employee.setSalary(20000);

        System.out.println("Modified employee name: " + employee.getName());
        System.out.println("Modified employee department: " + employee.getDepartment());
        System.out.println("Modified employee salary: " + employee.getSalary());
    }
}
