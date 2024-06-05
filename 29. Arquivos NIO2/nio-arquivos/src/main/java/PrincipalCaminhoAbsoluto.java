import java.nio.file.Path;

public class PrincipalCaminhoAbsoluto {

    public static void main(String[] args) {
        // Caminho absoluto
        //Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/docs/contrato.txt");

        // Caminho relativo
        Path arquivo = Path.of("docs/contrato.txt");

        Path arquivoAbsoluto = arquivo.toAbsolutePath();

        System.out.println(arquivo);
        System.out.println(arquivoAbsoluto);

        System.out.println(arquivo.isAbsolute());
        System.out.println(arquivoAbsoluto.isAbsolute()); //true

    }

}
