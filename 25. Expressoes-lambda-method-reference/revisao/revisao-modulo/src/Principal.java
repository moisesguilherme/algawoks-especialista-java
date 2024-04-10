import com.algaworks.crm.CadastroCliente;
import com.algaworks.crm.Cliente;
import com.algaworks.crm.Filtro;

import java.util.List;

public class Principal {
    public static void main(String[] args) {

        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 41));
        cadastroCliente.adicionar(new Cliente("José", 43));
        cadastroCliente.adicionar(new Cliente("Maria", 33));

        /*Filtro<Cliente> filtro = (Cliente cliente) -> {
            return cliente.getIdade() > 40;
        };*/
        //List<Cliente> clientes = cadastroCliente.consultar(filtro);


        /*List<Cliente> clientes = cadastroCliente.consultar((Cliente cliente) -> {
            return cliente.getIdade() > 40;
        });*/

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);


        for(Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }

    }
}