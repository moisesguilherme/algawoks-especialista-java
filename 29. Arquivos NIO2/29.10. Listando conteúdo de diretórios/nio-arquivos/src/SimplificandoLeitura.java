import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SimplificandoLeitura {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("docs/poema.txt");

        //Foma simples de ler arquivo
        /*
        try (var stream = Files.lines(path) ){
            stream.forEach(System.out::println);
        }*/

        //Carrega a lista com todos os arquivos, problema se o arquivo for grande
        /*Files.readAllLines(path)
                .forEach(System.out::println);
        */

        //Arquivos pequenos é bom
        /*String conteudo = Files.readString(path);
        System.out.println(conteudo);
        */

        byte[] bytes = Files.readAllBytes(path);
        System.out.println(Arrays.toString(bytes));

    }

}
