public class Personn {
    // Private attributes
    private String name;
    private int age;
    private char gender;

    // Getter methods to access private attributes 
    public String getName() {
        return name;         
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // Setter methods to modify private attributes 
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // Validate age if needed 
        if (age >= 0) {
            this.age = age;            
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setGender(char gender) {
        // Validate gender if needed
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender.");
        }
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Personn person = new Personn();
    
        // Using setter methods to modify attributes 
        person.setName("John");
        person.setAge(25);
        person.setGender('M');
    
        // Using getter methods to access attributes 
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
    
}
