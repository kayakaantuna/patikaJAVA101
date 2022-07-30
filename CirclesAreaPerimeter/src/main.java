import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circles radius: ");
        int r = scanner.nextInt();
        System.out.println("Enter center angle: ");
        int a = scanner.nextInt();

        double area = (3.14 * (r*r) * a)/360;
        double per = 2 * 3.14 * r;

        System.out.println("Area: " + area + " Perimeter: " + per);

    }
}
