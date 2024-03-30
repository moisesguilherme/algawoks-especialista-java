package desafio;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta_aluno {
    static final Scanner SCANNER = new Scanner(System.in);

    static final DateTimeFormatter FORMATADOR = DateTimeFormatter
            .ofPattern("d 'de' LLLL 'de' yyyy 'às' HH:mm:ss (zzzz)",
                    new Locale("pt", "BR"));

    static final ZoneId ZONA_SAO_PAULO = ZoneId.of("America/Sao_Paulo");
    static final ZoneId ZONA_LOS_ANGELES = ZoneId.of("America/Los_Angeles");
    static final ZoneId ZONA_JAPAO = ZoneId.of("Japan");

    public static void main(String[] args) {
        LocalDate dataFesta = obterDataFesta();
        LocalTime horarioFesta = obterHorarioFesta();

        LocalDateTime dataCompleta = LocalDateTime.of(dataFesta, horarioFesta);
        imprimirDatas(dataCompleta);
    }

    private static LocalDate obterDataFesta() {
        while(true) {
            try {
                System.out.print("Data local da festa: ");
                String data = SCANNER.nextLine();
                return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    private static LocalTime obterHorarioFesta() {
        while(true) {
            try {
                System.out.print("Horário local da festa: ");
                String horario = SCANNER.nextLine();
                return LocalTime.parse(horario, DateTimeFormatter.ofPattern("HH:mm"));
            } catch (DateTimeParseException e) {
                System.out.println("Horário inválido. Tente novamente.");
            }
        }
    }

    private static void imprimirDatas(LocalDateTime data) {
        List<ZonedDateTime> datas = gerarDatasParaCadaLocalidade(data);

        for (ZonedDateTime zonedDateTime : datas) {
            System.out.println(zonedDateTime.format(FORMATADOR));
        }
    }

    private static List<ZonedDateTime> gerarDatasParaCadaLocalidade(LocalDateTime data) {
        List<ZonedDateTime> datas = new ArrayList<>();

        datas.add(converterFusoHorario(data, ZONA_SAO_PAULO));
        datas.add(converterFusoHorario(data, ZONA_LOS_ANGELES));
        datas.add(converterFusoHorario(data, ZONA_JAPAO));

        return datas;
    }

    private static ZonedDateTime converterFusoHorario(LocalDateTime data, ZoneId destino) {
        return data.atZone(ZONA_SAO_PAULO).withZoneSameInstant(destino);
    }
}