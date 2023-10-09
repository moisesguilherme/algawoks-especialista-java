import com.algaworks.crm.Cliente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // ArrayList "puro" pode adicionar qualquer tipo de objeto
        ArrayList clientes = new ArrayList();

        clientes.add(new Cliente("Supermercado Pague e Leve", 2_000_000));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_000));
        //Objeto de outro tipo (precisa do instanceof abaixo)
        clientes.add("José");

        double totalFaturamento = 0d;

        for (Object objeto : clientes) {
            Cliente cliente;
            if(objeto instanceof Cliente) {
                cliente = (Cliente) objeto;
                totalFaturamento += cliente.getFaturamentoMensal();
            }
        }

        System.out.println(totalFaturamento);
    }

}