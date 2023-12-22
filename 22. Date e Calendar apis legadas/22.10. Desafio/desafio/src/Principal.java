import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Data da primeira parcela: ");
        String dataInicioTexto = scanner.nextLine();

        System.out.printf("Quantidade de parcelas: ");
        Integer quantidade = Integer.parseInt(scanner.nextLine());

        Date dataInicio = formatador.parse(dataInicioTexto);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicio);

        int diaDoMes = calendar.get(Calendar.DAY_OF_MONTH);

        for (Integer i = 0; i < quantidade; i++) {

            int diaPagamento = diaDoMes;
            //System.out.println("Debug: " + diaPagamento + " " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            if(diaPagamento > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
                diaPagamento = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            }

            String dataString = String.format("%d/%d/%d %n",
                      diaPagamento,
                      calendar.get(Calendar.MONTH) + 1,
                      calendar.get(Calendar.YEAR));

              Date data = formatador.parse(dataString);
              System.out.printf("Parcela #%d - %s %n", i+1, formatador.format(data));
              calendar.add( Calendar.MONTH, 1);
        }
    }
}
