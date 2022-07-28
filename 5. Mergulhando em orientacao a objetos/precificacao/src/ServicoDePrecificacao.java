public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        // poderia ter cálculos muito mais complexo aqui
        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro/100) + 1);

    }

}
