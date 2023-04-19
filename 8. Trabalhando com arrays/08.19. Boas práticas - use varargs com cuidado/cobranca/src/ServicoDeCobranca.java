import java.util.Objects;

public class ServicoDeCobranca {

    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "informe a fatura");
        Objects.requireNonNull(emailCobranca, "informe o email de cobranca");
        /* não é uma boa prática
        if(emailsAdicionais.length == 0) {
            throw new IllegalArgumentException("Informe no mínimo um e-mail de cobranca");
        }*/

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        enviarNotificacao(fatura, emailCobranca);

        for (String email : emailsAdicionais) {
            System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }

}
