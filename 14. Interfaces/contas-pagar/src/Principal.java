import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class Principal {
    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        // TODO Precisamos instanciar uma classe que implemente a interface

        Beneficiario funcionario = new Beneficiario("João da Silva", "3499999999", "456789");
        DocumentoPagavel holerite = new Holerite(funcionario, 100, 168);


        // Vc consegue criar uma outra classe que implementa DocumentoPagavel
        // e utilizar em servicoContaPagar sem alterar essa classe.
        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "10000000009989", "3439393");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        // Como se estivesse fazendo um cast (DocumentoPagavel) holerite
        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}