import java.io.File;
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
        //Path arquivo1 = fs.getPath("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/docs/contrato.txt");
        //Path arquivo1 = fs.getPath("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/","docs/contrato.txt");

        // Disponível apartir Java 11
        Path arquivo1 = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/docs/contrato.txt");

        System.out.println(arquivo1);

        Path nomeArquivo = arquivo1.getFileName();
        Path pasta = arquivo1.getParent();

        System.out.println(arquivo1);
        System.out.println(nomeArquivo);
        System.out.println(pasta);

        // Converter para API clássica de Io
        // File arquivo2 = arquivo1
        File arquivo2 = arquivo1.toFile();
        Path arquivo3 = arquivo2.toPath();

        // A classe file tem métodos para criar e excluir arquivos
        // Já a classe Path não tem isso, por esse motivo foi criada a Path

        //tb não lança exeções em muitos casos
        //metodo rename da classe file funciona diferente em algums plataformas
        //Classe file não entende links simbólicos
        //tb não tem como obter metadados do arquivo

    }



}
