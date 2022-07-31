import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current heat: ");
        int heat = scanner.nextInt();

        if(heat <= 5)
        {
            System.out.println("You can do ski! ");
        }
        if(heat > 5 && heat <= 15)
        {
            System.out.println("You can go to cinema!");
        }
        if(heat > 15 && heat <= 25)
        {
            System.out.println("You can do picnic!");
        }
        if(heat > 25)
        {
            System.out.println("You can go swimming");
        }
    }
}
