import java.util.Scanner;
public class Tax_Calculator {
    public static void main(String[] args){
        // Create a Scanner object for user input 
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the subtotal
        System.out.print("Enter the subtotal: $");
        double subtotal = scanner.nextDouble();
        // Prompt the user to enter the rax rate 
        System.out.print("Ente the tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();
        // Close the Scanner to release resources 
        scanner.close();
        //Calculate the tax and total 
        double tax = (subtotal * taxRate) / 100;
        double total = subtotal + tax;
        // Display the results
        System.out.println("\nTax: $" + tax);
        System.out.println("Toral: $" + total);
    }
    
}
