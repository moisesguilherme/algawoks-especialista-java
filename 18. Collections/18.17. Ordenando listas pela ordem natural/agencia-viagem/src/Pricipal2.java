import com.algaworks.agencia.Hotel;

public class Pricipal2 {

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Vila Selvagem", "Fortim/CE", 1600);
        Hotel hotel2 = new Hotel("Vila Selvagem", "Fortim/CE", 1440);

        System.out.println(hotel1.compareTo(hotel2));

    }

}
