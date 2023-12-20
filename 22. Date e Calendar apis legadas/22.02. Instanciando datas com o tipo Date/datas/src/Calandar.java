import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calandar {
    public static void main(String[] args) {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Calendar calendar = Calendar.getInstance();
        //Calendar calendar = new GregorianCalendar(1981, 9, 13); // inicia contar com mes 0
        // 13/10/1981 00:00:00

        Calendar calendar = new GregorianCalendar(1981, Calendar.SEPTEMBER, 13, 20, 30, 3);

        //System.out.println(calendar); // Verboso
        // java.util.GregorianCalendar
        // [time=1702982563448,
        // areFieldsSet=true,
        // areAllFieldsSet=true,
        // lenient=true,
        // zone=sun.util.calendar.ZoneInfo[
        // id="America/Sao_Paulo",
        // offset=-10800000,
        // dstSavings=0,
        // useDaylight=false,
        // transitions=93,
        // lastRule=null],
        // firstDayOfWeek=1,
        // minimalDaysInFirstWeek=1,
        // ERA=1,
        // YEAR=2023,
        // MONTH=11,
        // WEEK_OF_YEAR=51,
        // WEEK_OF_MONTH=4,
        // DAY_OF_MONTH=19,
        // DAY_OF_YEAR=353,
        // DAY_OF_WEEK=3,
        // DAY_OF_WEEK_IN_MONTH=3,
        // AM_PM=0,HOUR=7,
        // HOUR_OF_DAY=7,
        // MINUTE=42,
        // SECOND=43,
        // MILLISECOND=448,
        // ZONE_OFFSET=-10800000,
        // DST_OFFSET=0]

        //System.out.println(formatador.format(calendar)); // Erro  Cannot format given Object as a Date
        // Precisa extrair o date

        Date data = calendar.getTime();
        System.out.println(formatador.format(data));

    }
}
