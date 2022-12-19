public class Principal {

    // O ideal é que os métodos não tenham nehum argumento.
    // facilitar a legibilidade do código

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("Água", 5, 4);
   }

}
