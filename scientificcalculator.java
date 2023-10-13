import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Quit");

            int choice = scanner.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = addNumbers();
                    break;
                case 2:
                    result = subtractNumbers();
                    break;
                case 3:
                    result = multiplyNumbers();
                    break;
                case 4:
                    result = divideNumbers();
                    break;
                case 5:
                    result = power();
                    break;
                case 6:
                    result = squareRoot();
                    break;
                case 7:
                    result = sine();
                    break;
                case 8:
                    result = cosine();
                    break;
                case 9:
                    result = tangent();
                    break;
                case 10:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Result: " + result);
        }
    }

    public static double addNumbers() {
        System.out.print("Enter the first number: ");
        double num1 = getNumberInput();
        System.out.print("Enter the second number: ");
        double num2 = getNumberInput();
        return num1 + num2;
    }

    public static double subtractNumbers() {
        System.out.print("Enter the first number: ");
        double num1 = getNumberInput();
        System.out.print("Enter the second number: ");
        double num2 = getNumberInput();
        return num1 - num2;
    }

    public static double multiplyNumbers() {
        System.out.print("Enter the first number: ");
        double num1 = getNumberInput();
        System.out.print("Enter the second number: ");
        double num2 = getNumberInput();
        return num1 * num2;
    }

    public static double divideNumbers() {
        System.out.print("Enter the dividend: ");
        double dividend = getNumberInput();
        System.out.print("Enter the divisor: ");
        double divisor = getNumberInput();
        if (divisor != 0) {
            return dividend / divisor;
        } else {
            System.out.println("Error: Division by zero");
            System.exit(0);
            return 0; // This is here to satisfy the return type of the method
        }
    }

    public static double power() {
        System.out.print("Enter the base: ");
        double base = getNumberInput();
        System.out.print("Enter the exponent: ");
        double exponent = getNumberInput();
        return Math.pow(base, exponent);
    }

    public static double squareRoot() {
        System.out.print("Enter the number: ");
        double num = getNumberInput();
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Error: Square root of a negative number");
            System.exit(0);
            return 0; // This is here to satisfy the return type of the method
        }
    }

    public static double sine() {
        System.out.print("Enter the angle in degrees: ");
        double angleDegrees = getNumberInput();
        return Math.sin(Math.toRadians(angleDegrees));
    }

    public static double cosine() {
        System.out.print("Enter the angle in degrees: ");
        double angleDegrees = getNumberInput();
        return Math.cos(Math.toRadians(angleDegrees));
    }

    public static double tangent() {
        System.out.print("Enter the angle in degrees: ");
        double angleDegrees = getNumberInput();
        return Math.tan(Math.toRadians(angleDegrees));
    }

    public static double getNumberInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
