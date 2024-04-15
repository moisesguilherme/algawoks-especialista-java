package primitivos;

public class Principal {

    public static void main(String[] args) {
        int resultado = dividir(10, 0);

        System.out.println("Resultado: " + resultado);
    }

    private static int dividir(int x, int y) {
        return x / y;
    }

}
