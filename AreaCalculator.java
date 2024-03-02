import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Area of Circle is: " + calculateCircleArea(radius));
                break;
            case 2:
                System.out.println("Enter the length of Rectangle:");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of Rectangle:");
                double width = scanner.nextDouble();
                System.out.println("Area of Rectangle is: " + calculateRectangleArea(length, width));
                break;
            case 3:
                System.out.println("Enter the base of the Triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle:");
                double height = scanner.nextDouble();
                System.out.println("Area of Triangle is: " + calculateTriangleArea(base, height));
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }

        scanner.close();
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    private static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
