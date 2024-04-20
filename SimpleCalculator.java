import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();

            double result = 0.0;
            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.println("Enter first number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                case 5:
                    System.out.println("Enter base:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter exponent:");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    break;
                case 6:
                    quit = true;
                    System.out.println("Quitting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }

            if (!quit) {
                System.out.println("Result: " + result);
                System.out.println();
            }
        }

        scanner.close();
    }
}
