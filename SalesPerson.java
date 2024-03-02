public class SalesPerson extends Employee {
    private int salesTotal;

    // Constructor
    public SalesPerson(String name, String department, int salary, int salesTotal) {
        super(name, department, salary);
        this.salesTotal = salesTotal;
    }
    @Override
    public void work() {
        System.out.println(getName() + " is making sales.");
    }
    public int getSalesTotal() {
        return salesTotal;
    }
    public void setSalesTotal(int salesTotal) {
        this.salesTotal = salesTotal;
    }
    public static void main(String[] args) {
        SalesPerson salesPerson = new SalesPerson("Mang Chhunleang", "Sales", 50000, 1000);
        salesPerson.work();
        System.out.println("Sales Total: " + salesPerson.getSalesTotal());
    }
}
