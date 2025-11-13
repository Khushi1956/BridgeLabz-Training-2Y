interface SensitiveData {}  // Marker interface

class UserDetails implements SensitiveData {
    String ssn = "123-45-6789";
}

public class DataTagDemo {
    public static void main(String[] args) {
        UserDetails u = new UserDetails();
        if (u instanceof SensitiveData)
            System.out.println("Encrypting sensitive data before storage...");
    }
}
