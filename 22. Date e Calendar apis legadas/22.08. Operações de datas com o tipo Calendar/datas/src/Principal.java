import java.util.Calendar;

public class Principal {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // Calendar é mutável
        //calendar.set(Calendar.DAY_OF_MONTH, 21);

        //calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.add(Calendar.MONTH, 3); // -4 (subtrai meses)

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);

        System.out.println(calendar.getTime());
    }

}
