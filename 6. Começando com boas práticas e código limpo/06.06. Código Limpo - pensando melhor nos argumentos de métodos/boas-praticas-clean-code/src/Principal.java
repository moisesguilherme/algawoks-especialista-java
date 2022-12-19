public class Principal {

    // O ideal é que os métodos não tenham nehum argumento.
    // facilitar a legibilidade do código

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        // carrinho.adicionarItem("Água", 5, 4);
        // Reduzir abaixo para 2 argumentos

        Produto produto = new Produto();
        produto.precoUnitario = 5;
        produto.nome = "Água";

        // Reduziu o número de argumentos
        carrinho.adicionarItem(produto, 4);

        // Argumentos de flag
        // produto.alterarStatus(true);

        produto.ativo();
   }

}
