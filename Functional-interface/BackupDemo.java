import java.io.*;

class Employee implements Serializable {
    int id = 101;
    String name = "Khushi";
}

public class BackupDemo {
    public static void main(String[] args) {
        System.out.println("Employee object is serializable for backup.");
    }
}
