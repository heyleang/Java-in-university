import java.util.Scanner;

public class Sum_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        long sumOfFactorials = computeSumOfFactorials(N);
        System.out.println("Sum of factorials from 1! to N! is: " + 
        sumOfFactorials);
    }
    private static long computeSumOfFactorials(int N) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i; 
            sum += factorial; 
        }
        return sum;
    }
}
