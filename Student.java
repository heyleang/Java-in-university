public class Student {
    // privaite attributes
    private String name;
    private int rollNumber;
    // Default contructore
    public Student() {
        // Initializing attributes with default values 
        this.rollNumber = 0;
    }
    // Public method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
    }
    public static void main(String[] args) {
        // Creating an object of the student class using the default contructor
        Student student1 = new Student();
        // Display student details
        student1.displayDetails();
    }
}
    