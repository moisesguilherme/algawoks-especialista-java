import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class IdadePaciente {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Data de nascimento: ");
        String dataEntrada = scan.nextLine();
        LocalDate dataHoje = LocalDate.now();

        try{
            LocalDate dataNacimento = LocalDate.parse(dataEntrada,
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Period tempoVida = Period.between(dataNacimento, dataHoje);

            int anos = tempoVida.getYears();
            int meses = tempoVida.getMonths();
            int dias = tempoVida.getDays();

            String resultado = String.format("Paciente tem %d %s, %d %s e %d %s",
                    anos, anos == 1 ? "ano" : "anos",
                    meses, meses == 1 ? "mês" : "meses",
                    dias, dias == 1 ? "dia" : "dias");

            System.out.println(resultado);
        }catch (DateTimeParseException e){
            System.out.println("Data inválida. Tente novamente");
        }

    }

}
