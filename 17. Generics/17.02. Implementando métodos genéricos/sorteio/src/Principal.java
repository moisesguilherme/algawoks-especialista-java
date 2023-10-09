import com.algaworks.sorteio.Cliente;
import com.algaworks.sorteio.Conversor;
import com.algaworks.sorteio.Sorteador;

public class Principal {
    
    public static void main(String[] args) {

        String[] nomes = {"João", "José", "Maria"};
        //String nomeSorteado = Sorteador.<String, Integer>sortear(nomes, 10);
        String nomeSorteado = Sorteador.sortear(nomes, 10); //funciona
        System.out.println(nomeSorteado);

        Cliente[] clientes = {
            new Cliente("Supermercado Pague e Leve", 2_000_000),
            new Cliente("Posto Gasolina Boa", 800_000),
            new Cliente("Javac Consultoria", 58_000_000)
        };

        Cliente clienteSorteado = Sorteador.<Cliente, Integer>sortear(clientes, 10);
        System.out.println(clienteSorteado.getRazaoSocial());



    }

}