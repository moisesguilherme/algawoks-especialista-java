import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("docs");

        //Files.list(pasta).forEach(System.out::println);

        try(var stream = Files.list(pasta) ) {
               stream.map(Path::getFileName) //novo stream com filename
                       .filter(Files::isRegularFile)
                       .forEach(System.out::println);
        }


    }

}
