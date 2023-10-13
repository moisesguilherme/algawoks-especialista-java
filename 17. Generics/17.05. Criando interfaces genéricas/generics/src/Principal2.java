import java.util.ArrayList;

public class Principal2 {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(20d);
        numeros.add(10d);
        numeros.add(21d);

        System.out.println(calcularMedia(numeros));;
    }

    // ainda não consegue passar o ArrayList
    private static double calcularMedia(ArrayList<Number> numeros) {
        double total = 0;

        for(Number numero: numeros) {
            total = total + numero.doubleValue();
        }

        return total / numeros.size();
    }


}
