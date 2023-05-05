import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SEM01 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        System.out.println(formatter.format(now));
    }
}
