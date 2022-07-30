import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height (meter): ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        double bodyMassIndex = (weight) / (height * height);

        System.out.println("Your Body Mass Index: " + bodyMassIndex);
    }
}
