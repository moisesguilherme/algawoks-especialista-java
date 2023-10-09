import com.algaworks.crm.Cliente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Declara ArrayList de <Cliente> e instancia ArrayList de <Cliente>
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Supermercado Pague e Leve", 2_000_000));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_000));
        //Tempo de execucão e tempo de compilacão.
        //Com generics o código nem compila.
        //clientes.add("José");


        double totalFaturamento = 0d;
        //clientes.get(0);

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }

}