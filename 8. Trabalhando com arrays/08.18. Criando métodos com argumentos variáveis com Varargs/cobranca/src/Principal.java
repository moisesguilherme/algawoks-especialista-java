public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
        String[] email = new String[]{"teste@gmail.com", "teste2gmail.com"};
        servicoDeCobranca.pagar(fatura, email);

    }

}
