import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		var produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
		produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
		produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
		produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
		produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

		/*Iterator<Produto> produtoIterator = produtos.iterator();
		while(produtoIterator.hasNext()) {
			Produto produto = produtoIterator.next();
			if(produto.getQuantidade() < 1) {
				produtoIterator.remove();
			}
		}*/
		// predicate
		//produtos.removeIf(produto -> produto.getQuantidade() < 1);

		//Usando predicate
		Predicate<Produto> predicateSemEstoque = produto -> produto.getQuantidade() < 1;
		Predicate<Produto> predicateInativo = produto -> Produto.Status.INATIVO.equals(produto.getStatus());

		produtos.removeIf(predicateSemEstoque.or(predicateInativo));

		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
	
}