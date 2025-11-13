import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormatterApp {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateUtils.format(today, "dd-MM-yyyy"));
    }
}
