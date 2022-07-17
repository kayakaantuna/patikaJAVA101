import java.util.*;

public class main {
    public static void main(String[] args)
    {
        int a,b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Edge Numbers to Right Triangle: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse: " + c);

        double u = (a+b+c) / 2;
        double perimeter = 2*u;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Perimeter: " + perimeter + " Area: " + area);
    }
}
