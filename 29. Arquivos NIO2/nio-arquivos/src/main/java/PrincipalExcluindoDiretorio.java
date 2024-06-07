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
                System.out.printf("Excluido arquivo: %s%n", file);
                Files.delete(file);
                // Consegue percorrer todos os arquivos incluindo em sub-diretórios
                return FileVisitResult.CONTINUE; //super.visitFile(file, attrs);
            }


            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc)  throws IOException {
                // excluir a pasta antes de excluir os arquivos
                System.out.printf("Excluido diretorio: %s%n", dir);
                Files.delete(dir);
                return super.postVisitDirectory(dir, exc);//FileVisitResult.CONTINUE;
            }

            /*
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                // excluir a pasta antes de excluir os arquivos
                System.out.printf("Excluido diretorio: %s%n", dir);
                return FileVisitResult.CONTINUE;
            }*/


        });

    }

}
