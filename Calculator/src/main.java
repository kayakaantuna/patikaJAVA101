import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();

        System.out.println("1-Addition, 2-Subtraction, 3-Multiplication, 4-Division");
        System.out.print("Choose an operation (1/2/3/4): ");
        int select = scanner.nextInt();

        double result;

        switch (select) {
            case 1:
                result = n1 + n2;
                System.out.println("Sum: " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Difference: " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Product: " + result);
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }
}
