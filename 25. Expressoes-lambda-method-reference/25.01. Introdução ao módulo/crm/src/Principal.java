import com.algaworks.crm.CadastroCliente;
import com.algaworks.crm.Cliente;
import com.algaworks.crm.Filtro;

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

        /*int y = 1;
        Filtro<Cliente> filtro = new Filtro<Cliente>() {
            @Override
            public boolean avaliar(Cliente cliente) {
                int y = 10; //Classe anônimas pode ter variáveis locais com o mesmo nome de variáveis de outro escopo
                System.out.println(y);
                return cliente.getIdade() > 40;
            }
        };*/

        int y = 1;

        List<Cliente> clientes = cadastroCliente.consultar((Cliente cliente) -> {
            // y++; // precisa ser final
            System.out.println(this.nome); // Consegue pegar o nome pq roda no escopo do método executar
            boolean resultado = cliente.getIdade() > 40;
            return resultado;
        });


        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }

}