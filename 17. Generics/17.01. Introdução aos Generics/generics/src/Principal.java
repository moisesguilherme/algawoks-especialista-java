import com.algaworks.crm.Cliente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        //Generics a partir do java 5, a partir do java 7 (a instancia não precisa especificar o tipo)
        // Declara ArrayList de <Cliente> e instancia ArrayList de <Cliente>
        // operador diamante <> -> ArrayList<>()
        // cuidado com operador var:
        //var clientes = new ArrayList<Object>();
        //var clientes = new ArrayList<Cliente>();

        ArrayList<Cliente> clientes = new ArrayList<>();
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