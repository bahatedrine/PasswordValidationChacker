import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String result = verifyPassword(password);
        System.out.println(result);
    }

    public static String verifyPassword(String password) {
        // Minimum length of 10 characters
        if (password.length() < 10) {
            return "Verification failed: Password must be at least 10 characters long.";
        }

        // At least 1 capital letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return "Verification failed: Password must contain at least 1 capital letter.";
        }

        // At least 1 punctuation mark
        if (!Pattern.compile("[!@#$%^&*(),.?\\[\\]{}|<>]").matcher(password).find()) {
            return "Verification failed: Password must contain at least 1 punctuation mark.";
        }

        // At least 1 digit or number
        if (!Pattern.compile("\\d").matcher(password).find()) {
            return "Verification failed: Password must contain at least 1 digit.";
        }

        // All conditions passed, password is valid
        return "Password verification passed! the password is valid";
    }
}

