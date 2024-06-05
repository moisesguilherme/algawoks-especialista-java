import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrincipalOperacoesBasicas {

    public static void main(String[] args) throws IOException {

        // Files
        //Path pastaDocs = Path.of("docs");
        //Files.createDirectory(pastaDocs); // A mesma IOExceptio da java.io

        Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
        //Files.createDirectory(pastaFornecedores); // Erro -> cria só o último caminho
        //Files.createDirectories(pastaFornecedores);

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
        //System.out.println(arquivoContrato);
        Files.createFile(arquivoContrato);
        System.out.println(Files.exists(arquivoContrato));


    }

}

