import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if(username.equals("patika"))
        {
            if(password.equals("java123"))
            {
            System.out.println("You are logged in.");
            }else
            {
                System.out.println("Your password is wrong... Want to restart your password ? 1/0 ");
                int answer = scanner.nextInt();
                if (answer == 1)
                {
                    System.out.println("Enter your new password: ");
                    scanner.nextLine();
                    String newPass = scanner.nextLine();
                    if(newPass.equals("java123"))
                    {
                        System.out.println("New password cannot be the same as old one, please enter a new one.");
                    }else
                    {
                        System.out.println("Your password updated.");
                    }
                }
            }
        }else {
            System.out.println("Your username or password is wrong.");
        }
    }
}
