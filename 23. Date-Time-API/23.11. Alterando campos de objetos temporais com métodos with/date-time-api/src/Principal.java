import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Principal {

    public static void main(String[] args) {

        // Alterar alguns campos dos objetos temporais
        // LocalDate é uma classe imutável (não altera o valor)

        LocalDateTime dataHoraAgora = LocalDateTime.now();

        // precisa fazer uma cópia
        //LocalDateTime novaDataHora = dataHoraAgora.with(ChronoField.DAY_OF_MONTH, 9);
        LocalDateTime novaDataHora = dataHoraAgora.withDayOfMonth(6)
                .withYear(1980)
                .withMonth(8)
                .withHour(12)
                .withMinute(13)
                .withSecond(11);

        System.out.println(dataHoraAgora);
        System.out.println(novaDataHora);

    }

}
