import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalCollect2 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println(produtos);

        List<String> nomeProdutos = produtos.stream()
                .map(Produto::getNome)
                .collect(Collectors.toList());



        // Pegar todas as categorias
        List<Categoria> listaCategoria = new ArrayList<>();

        List<Categoria> listProdutos2 = produtos.stream()
                .flatMap(produto -> produto.getCategorias().stream())
                .collect(Collectors.toList());

        System.out.println(listProdutos2);

        /*
        for(Categoria cat: catList) {
            cat.getId();
        }

        List<CategoriaDTO> lsitDTO - new ArrayList();
        for(Categoria cat: list) {
            listDTO.add(New CategoriaDTO(cat));
        }

        Optional<String> opt;
        Category entity = opt.orElseThrow( (c) -> new RuntimeException("Erro"));
        */

    }

}
