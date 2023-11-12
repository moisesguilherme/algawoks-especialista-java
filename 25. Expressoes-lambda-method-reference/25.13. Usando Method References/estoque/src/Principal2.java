import com.algaworks.estoque.MinhaInterfaceFuncional;
import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.function.Function;

public class Principal2 {

    public static void main(String[] args) {
        //Function<String, Produto> function = nome -> new Produto(nome);
        //Function<String, Produto> function = Produto::new;
        MinhaInterfaceFuncional mf = Produto::new;
        Produto p1 = mf.setProduto("Arroz", new BigDecimal(1),1);
        System.out.println(p1);


    }

}
