import java.util.Scanner;


public class main {
    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();

        System.out.println("1-Sum, 2-Subtraction, 3-Multiplication, 4-Division");
        System.out.println("Chose one: ");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                System.out.println("Sum: " + (n1+n2));
                break;

            case 2:
                System.out.println("Sum: " + (n1-n2));
                break;

            case 3:
                System.out.println("Sum: " + (n1*n2));
                break;

            case 4:
                System.out.println("Sum: " + (n1/n2));
                break;
        }
    }
}
