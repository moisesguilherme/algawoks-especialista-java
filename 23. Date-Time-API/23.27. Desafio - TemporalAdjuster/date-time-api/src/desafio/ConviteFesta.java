package desafio;

import java.lang.management.OperatingSystemMXBean;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class ConviteFesta {


    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);

        Optional<LocalDate> dataLocal = Optional.empty();
        Optional<LocalTime> horaLocal = Optional.empty();

        while (!dataLocal.isPresent() || !horaLocal.isPresent()) {
            if(!dataLocal.isPresent())
                dataLocal = validaData(entrada);
            else
                horaLocal = validaHora(entrada);
        }

        exibirHorarios(dataLocal.get(), horaLocal.get());
    }

    public static Optional<LocalDate> validaData(Scanner entrada) {
        System.out.print("Data local da festa: ");
        String dataDigitada = entrada.nextLine();

        try{
            LocalDate data = LocalDate.parse(dataDigitada,
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return Optional.of(data);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Tente novamente. ");
        }
        return Optional.empty();
    }

    public static Optional<LocalTime> validaHora(Scanner entrada) {
        System.out.print("Horário local da festa: ");
        String horaDigitada = entrada.nextLine();

        try{
            LocalTime time = LocalTime.parse(horaDigitada,
                    DateTimeFormatter.ofPattern("HH:mm"));

            return Optional.of(time);
        } catch (DateTimeParseException e) {
            System.out.println("Hora inválida. Tente novamente. ");
        }

        return Optional.empty();
    }

    private static void exibirHorarios(LocalDate dataLocalFesta, LocalTime horaLocalFesta) {

        //LocalDateTime dataLocalDaFesta
        //LocalDateTime dataLocalDaFesta = LocalDateTime.of(dataLocal.get(), horaLocal.get());

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("d 'de' LLLL 'de' yyyy 'às' HH:mm:ss (zzzz)",
                        new Locale("pt", "BR"));


        ZonedDateTime dataFestaFusoPadrao = dataLocalFesta.atTime(horaLocalFesta)
                .atZone(ZoneId.systemDefault());

        ZonedDateTime dataHoraSaoPaulo = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime dataHoraLosAngeles = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));


        ZonedDateTime dataHoraJapao = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("Japan"));


        System.out.println(dataHoraSaoPaulo.format(formatter));
        System.out.println(dataHoraLosAngeles.format(formatter));
        System.out.println(dataHoraJapao.format(formatter));

    }

}

