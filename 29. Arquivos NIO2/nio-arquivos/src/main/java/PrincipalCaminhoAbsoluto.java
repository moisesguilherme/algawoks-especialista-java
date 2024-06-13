import java.nio.file.Path;

public class PrincipalCaminhoAbsoluto {

    public static void main(String[] args) {
        // Caminho absoluto
        //Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/docs/contrato.txt");

        // Caminho relativo
        Path arquivo = Path.of("../contrato.txt");

        Path arquivoAbsoluto = arquivo.toAbsolutePath();

        System.out.println(arquivo);
        System.out.println(arquivoAbsoluto);

        System.out.println(arquivo.isAbsolute());
        System.out.println(arquivoAbsoluto.isAbsolute()); //true

        ///home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/nio-arquivos/../contrato.txt
        // Equivalente a linha abaixo
        //home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/29. Arquivos NIO2/contrato.txt

        //Normalizar o arquivo
        System.out.println("------ [ Normalizar o arquivo ] --------" );
        Path arquivoNormalizado = arquivoAbsoluto.normalize();
        System.out.println(arquivoNormalizado);

    }

}
