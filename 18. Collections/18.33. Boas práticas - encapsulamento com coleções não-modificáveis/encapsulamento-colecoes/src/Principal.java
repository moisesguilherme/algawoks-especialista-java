import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ItemVenda;
import com.algaworks.comercial.Venda;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        ItemVenda mouse = new ItemVenda("Magic mouse", 700);
        ItemVenda adaptadorUsb = new ItemVenda("Adaptador USB", 400);
        ItemVenda macbook = new ItemVenda("Macbook Pro", 15_000);
        ItemVenda limpaTela = new ItemVenda("Limpa tela", 70);

        Cliente cliente = new Cliente("João da Silva", 2_000);
        Venda venda = new Venda(cliente);

        venda.adicionarItem(mouse);
        venda.adicionarItem(adaptadorUsb);
        //venda.adicionarItem(macbook);


        //Pode fazer isso, o método add do list.
        // vai conseguir adicionar e não passar pela validacao
        // do adicionarItem
        //venda.getItens().add(macbook); // vai lancar um erro: UnsupportedOperationException

        List<ItemVenda> itensNaoModificaveis = venda.getItens();
        //itensNaoModificaveis.add(macbook);

        // Vai imprimir todos os itens
        System.out.println(itensNaoModificaveis);
        // ao adicionar vai ter reflexo no intensNaoModificaveis
        venda.adicionarItem(limpaTela);
        System.out.println(itensNaoModificaveis);

        // vai adicionar em itens da Classe venda e não vai refletir em itensNaoModificaveis
        System.out.println(venda.getItens());

        //System.out.println(venda.getValorTotal());
        //System.out.println(venda.getItens());
    }

}
