import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		var produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
		produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 1));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.1"), 1));
		produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
		produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
		produtos.add(new Produto("Arroz", new BigDecimal("15.8"), 0));
		produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

   		// interface funcional function 

		//produtos.sort((produto1, produto2) -> Integer.compare(produto1.getQuantidade(), produto2.getQuantidade()));
		// -> com comparator precisa colocar a lógica de comparacão (compare)

		//produtos.sort((produto1, produto2) -> produto1.getPreco().compareTo(produto2.getPreco()));

		/*
		for (Produto produto : produtos) {
			System.out.println(produto);
		}*/

		Function<Produto, Integer> function1 = produto -> produto.getQuantidade();
		Function<Produto, String> function2 = produto -> produto.getNome();
		Function<Produto, BigDecimal> function3 = produto -> produto.getPreco();

		produtos.sort(Comparator.comparing(function1).thenComparing(function2).thenComparing(function3)); //function1 é um get (extracão de um valor do objeto)


		// getQuantidade é um tipo primitivo (int)
		// vai fazer o boxing, converter o int primitivo para Integer
		// function só trabalha com classe (objetos)
		// produtos.sort(Comparator.comparing(produto -> produto.getQuantidade()));
		// ToIntFunction

		// Essa comparacão é mais rápida
		//produtos.sort(Comparator.comparingInt(produto -> produto.getQuantidade()));
		//ToLongFunction
		//LongToDoubleFunction
		//IntToLongFunction
		//UnaryOperator -> recebe um objeto e retornar ele

		/*
		UnaryOperator<Produto> functionModifica = produto -> {
			produto.setQuantidade(0);
			produto.setNome(produto.getNome() + " modificado");
			return produto;
		};

		produtos.forEach(produto -> functionModifica.apply(produto));
		produtos.forEach(produto -> System.out.println(produto));

		 */
		produtos.forEach(produto -> System.out.println(produto));

	}
	
}