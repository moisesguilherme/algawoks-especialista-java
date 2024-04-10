public class TesteDouble {

    public static void main(String[] args) {

        // float e double não tem precisao
        double mesada = 1.0;

        double cinema = 0.10;
        double pipoca = 0.20;
        double uber = 0.30;
        double lanche = 0.40;


        double sobrou = mesada - cinema - pipoca - uber;

        System.out.println(sobrou);

    }
}
