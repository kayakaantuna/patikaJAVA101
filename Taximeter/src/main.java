import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        int km;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance traveled in km: ");
        km = scanner.nextInt();

        double calculate;
        calculate = 10 + (km * 2.20) > 20 ? km * 2.20 : 20;
        System.out.println("Total Price: " + calculate);
    }
}
