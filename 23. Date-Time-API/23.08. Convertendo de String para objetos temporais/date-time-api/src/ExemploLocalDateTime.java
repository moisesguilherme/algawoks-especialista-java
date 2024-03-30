import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {

    public static void main(String[] args) {
        //LocalDateTime horario = LocalDateTime.parse("2010-08-20T19:45:20");
        LocalDateTime horario = LocalDateTime.parse("03/10/2026 21:03:19",
                DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"));

        System.out.println(horario);
    }

}
