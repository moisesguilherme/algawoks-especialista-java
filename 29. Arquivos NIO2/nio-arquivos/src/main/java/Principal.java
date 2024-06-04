import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

    public static void main(String[] args) {

        // Sistema de arquivos
        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs); //linux -> sun.nio.fs.LinuxFileSystem@a09ee92

        // O Path depende do sistema de arquivos
        Path arquivo1 = fs.getPath("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/docs/contrato.txt");
        System.out.println(arquivo1);

        Path nomeArquivo = arquivo1.getFileName();
        Path pasta = arquivo1.getParent();

        System.out.println(nomeArquivo);
        System.out.println(pasta);

    }


}
