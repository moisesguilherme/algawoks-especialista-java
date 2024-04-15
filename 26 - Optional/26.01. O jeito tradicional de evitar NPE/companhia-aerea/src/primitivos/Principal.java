package primitivos;

import java.util.Optional;

public class Principal {

    public static void main(String[] args) {
        Optional<Integer> resultadoOptional = dividir(10, 0);

        resultadoOptional.ifPresentOrElse(resultado -> System.out.println("Resultado " + resultado),
                ()-> System.out.println("Sem resultado"));

    }

    // Optional<int> não tem como para tipos primitivos
    private static Optional<Integer> dividir(int x, int y) {
        if(y == 0) return Optional.empty();
        return Optional.of(x / y);
    }

}
