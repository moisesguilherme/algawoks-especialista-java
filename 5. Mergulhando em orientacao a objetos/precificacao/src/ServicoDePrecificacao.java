public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexo aqui

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro/100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }

}
