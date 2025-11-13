interface SecurityUtils {
    static boolean isStrongPassword(String pass) {
        return pass.length() >= 8 && pass.matches(".*[A-Z].*") && pass.matches(".*\\d.*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Abc12345")); // true
    }
}
