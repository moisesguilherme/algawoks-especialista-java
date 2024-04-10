import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringData = verificaInput(scan, "Data do evento: ", true);
        String stringHorario = verificaInput(scan, "Horario do evento: ", false);

        DateTimeFormatter formatador = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                .withLocale(new Locale("pt", "BR"));

        LocalDateTime finalDateTime = LocalDateTime.parse(
                stringData + " " + stringHorario,
                DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"));

        System.out.println("Evento agendado para " + formatador.format(finalDateTime));
    }

    public static String verificaInput(Scanner scan, String mensagem, boolean data) {
        String stringData;
        boolean continuar = false;

        do {
            System.out.print(mensagem);
            stringData = scan.next();
            continuar = data ? (verificaData(stringData) == null) : (verificaHorario(stringData) == null);
        } while (continuar);

        return stringData;
    }

    public static LocalDate verificaData(String stringData) {
        try{
            return LocalDate.parse(stringData,
                    DateTimeFormatter.ofPattern("dd/MM/yyy"));

        } catch (DateTimeException ex){
            System.out.println("Data inválida. Tente novamente");
        }

        return null;
    }

    public static LocalTime verificaHorario(String stringHorario) {
        try{
            return LocalTime.parse(stringHorario,
                    DateTimeFormatter.ofPattern("HH:mm:ss"));
        } catch (DateTimeException ex){
            System.out.println("Hora inválida. Tente novamente");
        }

        return null;
    }

}
