import java.util.Scanner;

public class Sum_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 100: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 100) {
            System.out.println("Please enter a valid integer between 0 and 100");
        } else {
            int sum = 0;
            int originalNumber = number;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println("The sum of digits in " + originalNumber + " is: " + sum);
        }
    }
}
