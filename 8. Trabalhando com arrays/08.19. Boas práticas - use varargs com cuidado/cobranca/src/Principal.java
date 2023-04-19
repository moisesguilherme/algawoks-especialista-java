public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

        //servicoDeCobranca.pagar(fatura, "joao@algaworks.com", "maria@algaworks.com", "jose@algaworks.com");

        //servicoDeCobranca.pagar(fatura, "joao@algaworks.com", "joao@algaworks.com", "maria@algaworks.com", "jose@algaworks.com");
        servicoDeCobranca.pagar(fatura, null, "joao@algaworks.com", "maria@algaworks.com", "jose@algaworks.com");
    }

}
