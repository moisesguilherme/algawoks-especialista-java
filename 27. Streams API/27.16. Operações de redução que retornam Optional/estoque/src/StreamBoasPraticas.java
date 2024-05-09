import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamBoasPraticas {

    public static void main(String[] args) {
        // Boas práticas uso do Stream

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //List<Fabricante> fabricantes = new ArrayList<>();


        // Sempre q for trabalhar com stream não deve gerar
        // função que vc passa como operação, não deve gerar efeito colateral com estado da aplicação
        // (alterar uma variável externa)

        // não pode ter dependência de variável externa

        /*produtos.stream()
                .filter(Produto::temEstoque)
                .forEach(produto -> {
                    if(!fabricantes.contains(produto.getFabricante())){
                        fabricantes.add(produto.getFabricante()); //Altera o estado de um objeto, de uma variável externa
                    }
                });
        */

        List<Fabricante> fabricantes = produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct()
                .toList();

        System.out.println(fabricantes);
    }

}
