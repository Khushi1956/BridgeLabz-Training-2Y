import java.util.function.Function;

public class LengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> length = msg -> msg.length();
        String text = "System Overload Warning!";
        System.out.println("Message length: " + length.apply(text));
    }
}
