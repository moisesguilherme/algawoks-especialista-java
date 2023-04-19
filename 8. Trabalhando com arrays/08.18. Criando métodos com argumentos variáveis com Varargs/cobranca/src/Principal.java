public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

        // String[] emailsCobranca = {"joao@gmail.com", "maria@gmail.com"};
        // servicoDeCobranca.pagar(fatura, emailsCobranca);

        // servicoDeCobranca.pagar(fatura, new String[] {"joao@gmail.com", "maria@gmail.com"});

        // servicoDeCobranca.pagar(fatura, new String[]);
        // servicoDeCobranca.pagar(fatura, new String[]{});

        //varargs
        // benefício, simplifica a chamada do método, não precisa instanciar
        //servicoDeCobranca.pagar(fatura, "joao@gotocode.com", "maria@gotocode.com.br");
        // Não precisa passar, vai gerar um array vazio
        servicoDeCobranca.pagar(fatura);

        servicoDeCobranca.teste(1, 2, 3, 4, 5);
    }

}
