package primitivos;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Principal {

    public static void main(String[] args) {
        OptionalInt resultadoOptional = dividir(10, 0);

        resultadoOptional.ifPresentOrElse(resultado -> System.out.println("Resultado " + resultado),
                ()-> System.out.println("Sem resultado"));

    }

    // Optional<int> não tem como para tipos primitivos
    // Trabalhar com o OptionalInt
    private static OptionalInt dividir(int x, int y) {
        if(y == 0) return OptionalInt.empty();
        return OptionalInt.of(x / y);
    }

    //OptionalDouble
    //OptionalLong

}
