package interfacee;

interface SecurityUtils {
 static boolean isStrongPassword(String password) {

     if (password.length() < 8)
         return false;

     boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

     for (char ch : password.toCharArray()) {
         if (Character.isUpperCase(ch)) hasUpper = true;
         else if (Character.isLowerCase(ch)) hasLower = true;
         else if (Character.isDigit(ch)) hasDigit = true;
         else hasSpecial = true;
     }

     return hasUpper && hasLower && hasDigit && hasSpecial;
 }
}
@FunctionalInterface
interface PasswordChecker {
 void check(String password);
}

public class PasswordValidatorCombined {
 public static void main(String[] args) {

     System.out.println("=== OOP Style Validation ===");

     String password1 = "Mahak@123";
     String password2 = "hello123";

     System.out.println("Password: " + password1);
     System.out.println("Is Strong? " + SecurityUtils.isStrongPassword(password1));

     System.out.println("\nPassword: " + password2);
     System.out.println("Is Strong? " + SecurityUtils.isStrongPassword(password2));

     System.out.println("\n=== Functional Style Validation (Using Lambda) ===");

     PasswordChecker checker = (password) -> {
         boolean result = SecurityUtils.isStrongPassword(password);
         System.out.println("Password: " + password + " → " + (result ? "Strong ✅" : "Weak ❌"));
     };

     checker.check("Admin@123");
     checker.check("password");
     checker.check("Hello2025!");
 }
}
