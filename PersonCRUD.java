import java.util.ArrayList;

public class PersonCRUD {
    private static ArrayList<Person> personList = new ArrayList<>();

    // Create (Add)
    public void addPerson(String name, int age) { 
        Person newPerson = new Person(name, age); 
        personList.add(newPerson);
        System.out.println("Added: " + newPerson);
    }

    // Read (Display)
    public void displayPeople() {
        System.out.println("People in the list:");
        for (Person person : personList) { 
            System.out.println(person);
        }
    }

    // Update
    public void updatePersonAge(String name, int newAge) { 
        for (Person person : personList) { 
            if (person.getName().equals(name)) { 
                person.setAge(newAge);
                System.out.println("Updated: " + person);
                return;
            }
        }
        System.out.println("Person not found with name: " + name);
    }

    // Delete
    public void deletePerson(String name) {
        for (Person person : personList) { 
            if (person.getName().equals(name)) { 
                personList.remove(person);
                System.out.println("Deleted: " + person);
                return;
            }
        }
        System.out.println("Person not found with name: " + name);
    }

    public static void main(String[] args) {
        PersonCRUD p = new PersonCRUD();

        // Add operation
        System.out.println("Adding people");
        p.addPerson("Alice", 25);
        p.addPerson("Bob", 30);
        p.addPerson("Charlie", 22);
        System.out.println("======= Finished Adding Operation ======");

        System.out.println("");
        System.out.println("Displaying people in the list");
        // Display list of people
        p.displayPeople();
        System.out.println("");

        System.out.println("Updating people in the list");
        // Update new age for Bob
        p.updatePersonAge("Bob", 40);
        System.out.println("======= Updating finished =======");
        System.out.println("");

        System.out.println("Displaying people in the list");
        // Display updated list
        p.displayPeople();
        System.out.println("Deleting person in the list");

        // Delete Bob from the list
        p.deletePerson("Bob");
        System.out.println("Deleting finished");
        System.out.println("");

        System.out.println("Displaying people in the list");
        // Display updated list
        p.displayPeople();
    }
}
