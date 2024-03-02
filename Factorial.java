import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        double sum = computeFactorialSum(N);
        System.out.println("The sum is: " + sum);
    }
    private static double computeFactorialSum(int N) {
        double sum = 0;
        double factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i; 
            sum += 1.0 / factorial;
        }
        return sum;
    }
}


