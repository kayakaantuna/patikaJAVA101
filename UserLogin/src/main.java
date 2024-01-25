import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (isValidLogin(username, password)) {
            System.out.println("You are logged in.");
        } else {
            System.out.println("Your username or password is wrong.");
            System.out.print("Want to reset your password? (1 for yes, 0 for no): ");
            int answer = scanner.nextInt();
            if (answer == 1) {
                resetPassword(scanner);
            }
        }
    }

    private static boolean isValidLogin(String username, String password) {
        return username.equals("patika") && password.equals("java123");
    }

    private static void resetPassword(Scanner scanner) {
        System.out.print("Enter your new password: ");
        String newPass = scanner.next();
        if (newPass.equals("java123")) {
            System.out.println("New password cannot be the same as the old one, please enter a new one.");
            resetPassword(scanner);
        } else {
            System.out.println("Your password is updated.");
        }
    }
}
