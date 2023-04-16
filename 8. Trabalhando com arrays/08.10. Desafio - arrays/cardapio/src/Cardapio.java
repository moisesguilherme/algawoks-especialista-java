import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclusão de item do cardápio
        this.itens = Arrays.copyOf(this.itens, this.itens.length +1);
        itens[itens.length -1] = item;
    }

    void removerItem(int indice) {
        // TODO implementar exclusão de item do cardápio da posição informada
        ItemCardapio[] itemsNovoArray = new ItemCardapio[itens.length -1];
        // Coloca primeira parte do array
        System.arraycopy(itens, 0, itemsNovoArray, 0, indice);
        // Coloca a segunda parte do array
        System.arraycopy(itens, indice+1, itemsNovoArray, indice,itemsNovoArray.length - indice);
        itens = itemsNovoArray;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
        for (ItemCardapio item : itens) {
            if(item.preco >= precoMinimo && item.preco <= precoMaximo )
                System.out.println(item.descricao + " Preco:" + item.preco);
        }
    }

}