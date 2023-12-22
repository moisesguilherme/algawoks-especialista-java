import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal4 {

    public static void main(String[] args) throws ParseException {

        // Convertendo de String para Data
        //String dataTexto = "30/12/2023 10:20:45";
        //DateFormat formatador = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");

        String dataTexto = "30/12/2023 10:20:45";
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatador.parse(dataTexto);
        System.out.println(data);
        System.out.println(formatador.format(data)); // somente a data


    }

}
