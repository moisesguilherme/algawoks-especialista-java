import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
        //DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Data de nascimento: ");
        String dataAniversarioTexto = scanner.nextLine();

        Date dataNascimento = formatador.parse(dataAniversarioTexto);

        Calendar calendar = Calendar.getInstance(); // Calandar é mutável
        calendar.setTime(dataNascimento);

        System.out.println(calendar.getTime());

        //if(calendar.get(Calendar.MONTH) == 11) { //Dezembro é 11 (old)
        if(calendar.get(Calendar.MONTH) == Calendar.DECEMBER
                && calendar.get(Calendar.DAY_OF_MONTH) == 25) { // Ideal é usar a constante
            System.out.println("Você nasceu no Natal! Ho ho ho!");
        } else if (calendar.get(Calendar.DAY_OF_YEAR) == 256) {
            System.out.println("Você nasceu no dia do programador! Hello World");
        }
        //22/12/1980 23:12:11
        System.out.println(calendar.get(Calendar.HOUR)); //11
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); //23

    }

}
