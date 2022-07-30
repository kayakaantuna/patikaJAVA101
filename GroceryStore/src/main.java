import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pear (kg): ");
        int pear = scanner.nextInt();
        System.out.println("Apple (kg): ");
        int apple = scanner.nextInt();
        System.out.println("Tomato (kg): ");
        int tomato = scanner.nextInt();
        System.out.println("Banana (kg): ");
        int banana = scanner.nextInt();
        System.out.println("Eggplant (kg): ");
        int eggplant = scanner.nextInt();

        double price = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (eggplant * 5);
        System.out.println("Total price: " + price + " TL");
    }
}
