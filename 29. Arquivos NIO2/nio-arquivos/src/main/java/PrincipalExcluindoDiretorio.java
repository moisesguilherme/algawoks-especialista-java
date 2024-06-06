import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PrincipalExcluindoDiretorio {

    public static void main(String[] args) throws IOException {

       Path pastaDocs = Path.of("docs");
       // Lança a exceção -> DirectoryNotEmptyException
       //Files.delete(pastaDocs);


        // Percorre todo_ o conteúdo dentro do diretório
        // Classe anônima
        Files.walkFileTree(pastaDocs, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                // Callback
                return super.visitFile(file, attrs);
            }
        });

    }

}
