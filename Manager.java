public class Manager extends Employee {
    private String team;

    // Constructor
    public Manager(String name, String department, int salary, String team) {
        super(name, department, salary);
        this.team = team;
    }

    // Method to override the work() method in the Employee class
    @Override
    public void work() {
        System.out.println(getName() + " is leading the team.");
    }

    // Getter and setter methods for the team attribute
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
