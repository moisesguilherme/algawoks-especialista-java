import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ItemVenda;
import com.algaworks.comercial.Venda;
import com.algaworks.comercial.VendaTeste;

import java.util.ArrayList;
import java.util.List;

public class testIterable {

    public static void main(String[] args) {
        ItemVenda abridorDeLata = new ItemVenda("Abridor de lata", 30);
        ItemVenda limpador = new ItemVenda("Limpador de vidro", 40);

        Cliente cliente = new Cliente("Moisés Guilherme", 100);
        VendaTeste venda = new VendaTeste(cliente);
        venda.adicionarItem(abridorDeLata);

        List<ItemVenda> listaItems1 = venda.getItens();
        System.out.println(listaItems1);

        List<ItemVenda> listaItems2 = new ArrayList<>();
        listaItems2.add(new ItemVenda("Tira mancha", 10));
        listaItems2.add(new ItemVenda("Seca roupa", 20));


        venda.adicionarItens(listaItems2);
        // Adicionou a lista
        List<ItemVenda> listaItems3 = venda.getItens();
        System.out.println(listaItems3);
    }


}
