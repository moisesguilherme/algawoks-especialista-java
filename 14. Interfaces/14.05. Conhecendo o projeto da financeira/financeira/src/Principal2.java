import com.algaworks.financeira.modelo.ClienteFinanciavel;
import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.modelo.PessoaBonificavel;
import com.algaworks.financeira.servico.ServicoPagamentoBonus;

public class Principal2 {

    public static void main(String[] args) {
        //ClienteFinanciavel funcionario = new Funcionario("João da Silva", 18_000);
        //funcionario.calcularBonus(); // Não tem acesso

        //PessoaBonificavel acessa o calcularBonus
        //PessoaBonificavel funcionario = new Funcionario("João da Silva", 18_000);
        //funcionario.calcularBonus();

        Funcionario funcionario = new Funcionario("João da Silva", 18_000);
        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        //funcionario é uma PessoaBonificavel
        servicoPagamentoBonus.pagar(funcionario, 80);


    }
}
