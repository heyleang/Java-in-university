import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // each row
        Scanner sc = new Scanner(System.in);   
        // Taking noOfRows value from the user
        System.out.print("How Many Rows You Want In Your Pyramid? ");
        int noOfRows = sc.nextInt();       
        // Initializing rowCount with 1
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        // Implementing the logic
        for (int i = noOfRows; i > 0; i--) {
            // Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            // Incrementing the rowCount
            rowCount++;
        }
        // Close the Scanner
        sc.close();
    }
}
