import java.util.Objects;

public class ServicoDeCobranca {

    void pagar(Fatura fatura, String... emailsCobranca) {

        // não é uma boa prática
        if(emailsCobranca.length == 0) {
            throw new IllegalArgumentException("Informe no mínimo um e-mail de cobranca");
        }

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        for (String email : emailsCobranca) {
            System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
        }
    }

}
