import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class PrincipalDiretorios {

    public static void main(String[] args) throws IOException {

       Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
       Path arquivoContrato = Path.of("contrato-venda.txt");
       Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);

       Path pastaClientes = Path.of("docs/contratos/clientes");
       Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

       Path pastaParceiros = Path.of("docs/contratos/parceiros");



        System.out.println(arquivoContratoOrigem);
        System.out.println(arquivoContratoDestino);

        // não substitui o arquivo caso ele existir
        // Files.copy(arquivoContratoOrigem, arquivoContratoDestino);
        // Com REPLACE_EXISTING -> substitui
        // Files.copy(arquivoContratoOrigem, arquivoContratoDestino, REPLACE_EXISTING);

        // Não copia os arquivos
        Files.copy(pastaFornecedores, pastaParceiros);


    }

}
