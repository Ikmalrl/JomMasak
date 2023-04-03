import java.util.Scanner;

public class User {
    private String userId;
    private String password;

    public User() {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public User promptForIdAndPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        return new User();
    }
}
