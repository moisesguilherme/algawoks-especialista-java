import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrincipalExcluindoArquivos {

    public static void main(String[] args) throws IOException {

       Path arquivoContrato = Path.of("docs/contratos/fornecedores/contrato-venda.txt");
       //Files.delete(arquivoContrato);
        Files.deleteIfExists(arquivoContrato);

        //Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
        //Files.delete(pastaFornecedores);

        Path pastaClientes = Path.of("docs/contratos/clientes");
        // Se não existir a pasta vai lançar -> DirectoryNotEmptyException
        // Se for excluir e a pasta tiver com conteúdo, precisa excluir os intens da pasta
        Files.delete(pastaClientes);



    }

}
