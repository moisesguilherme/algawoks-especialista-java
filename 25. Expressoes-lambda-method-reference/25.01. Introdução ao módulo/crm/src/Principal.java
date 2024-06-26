import com.algaworks.crm.CadastroCliente;
import com.algaworks.crm.Cliente;

import java.util.List;

public class Principal {

    private String nome = "Cairo";

    public static void main(String[] args) {
        new Principal().executar();
    }

    public void executar() {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        // Comparator usando lamda expression
        //clientes.sort((cliente1, clientes2) -> Integer.compare(cliente1.getIdade(), clientes2.getIdade()));


        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }

}