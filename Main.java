public class Main {
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
        p.displayPeople(); // Corrected method name
        System.out.println("");

        System.out.println("Updating people in the list");
        // Update new age for Bob
        p.updatePersonAge("Bob", 40);
        System.out.println("======= Updating finished =======");
        System.out.println("");

        System.out.println("Displaying people in the list");
        // Display updated list
        p.displayPeople(); // Corrected method name
        System.out.println("Deleting person in the list"); // Corrected message

        // Delete Bob from the list
        p.deletePerson("Bob");
        System.out.println("Deleting finished");
        System.out.println("");

        System.out.println("Displaying people in the list"); // Display updated list
        p.displayPeople();
    }
}
