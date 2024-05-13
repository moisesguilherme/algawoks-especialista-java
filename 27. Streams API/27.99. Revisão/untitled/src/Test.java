import estoque.Categoria;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Categoria livros = new Categoria("Livros");

        Set<Categoria> categorias = new HashSet<>();
        categorias.add(livros);
        categorias.add(new Categoria("Eletrônicos"));

        if(categorias.contains(livros)){
            System.out.println("A categoria tem Livros");
        }

        if(categorias.contains("Livros")){
            System.out.println("A categoria tem Livros 2");
        }

        //Estudar esse:
        //this.categorias.addAll(Set.of(categorias))

    }

}
