import java.util.regex.*;
import java.util.Scanner;
public class lab3 {
    public static void main(String[] arg) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your password:");
            String password = sc.next();
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=\\S+$).{8,}";
            String pattern1 = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
            Pattern p = Pattern.compile(pattern);
            Pattern p1 = Pattern.compile(pattern1);
            if (password.matches(pattern) | password.matches(pattern1)) {
                    System.out.println("Your password is strong!");
                }
            else {
                System.out.println("""
                        Your password is bad. The symbol can be a number,
                        English letter, underscore. The password must contain at least
                        one capital letter, one small letter and one number.""");
            }
    }
}