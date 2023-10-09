import com.algaworks.sorteio.Cliente;
import com.algaworks.sorteio.Sorteador;

public class Principal {
    
    public static void main(String[] args) {

        String[] nomes = {"João", "José", "Maria"};
        String nomeSorteado = (String) Sorteador.sortear(nomes); // Espera cliente
        System.out.println(nomeSorteado);
        Cliente[] clientes = {
            new Cliente("Supermercado Pague e Leve", 2_000_000),
            new Cliente("Posto Gasolina Boa", 800_000),
            new Cliente("Javac Consultoria", 58_000_000)
        };

        // Fazendo um cast de Cliente
        Cliente clienteSorteado = (Cliente) Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }

}