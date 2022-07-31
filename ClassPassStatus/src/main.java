import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mat grade: ");
        int mat = scanner.nextInt();
        mat = mat >= 0 && mat <= 100 ? mat : 0;
        System.out.println("Physic grade: ");
        int phy = scanner.nextInt();
        phy = phy >= 0 && phy <= 100 ? phy : 0;
        System.out.println("Turkish grade: ");
        int tr = scanner.nextInt();
        tr = tr >= 0 && tr <= 100 ? tr : 0;
        System.out.println("Chemistry grade: ");
        int chem = scanner.nextInt();
        chem = chem >= 0 && chem <= 100 ? chem : 0;
        System.out.println("Music grade: ");
        int music = scanner.nextInt();
        music = music >= 0 && music <= 100 ? music : 0;

        double average = (mat + phy + tr + chem + music) / 5;
        if(average >= 55)
        {
            System.out.println("You pass the class with average: " + average);
        }else
        {
            System.out.println("You didn't pass the class, your average below 55");
        }
    }
}
