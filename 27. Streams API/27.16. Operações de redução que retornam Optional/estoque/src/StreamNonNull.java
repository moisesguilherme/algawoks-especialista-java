import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class StreamNonNull {

    public static void main(String[] args) {

        /*
        String nome = "João";
        //String nome = null;


        if (nome != null) {
            System.out.println("Nome informado");
        }

        if(nome == null){
            System.out.println("Nome informado");
        }

        if(Objects.nonNull(nome)) {
            System.out.println("Nome informado");
        }

        if (Objects.isNull(nome)) {
            System.out.println("Nome");
        }
        */

        // Imagina o stream com valores nulos
        Stream.of("João", null, "Maria", null)
                //.filter(nome -> nome != null)
                .filter(Objects::nonNull) // esse método é muito simples, ele foi criado para ser usado com Method Reference
                .forEach(System.out::println);

    }

}
