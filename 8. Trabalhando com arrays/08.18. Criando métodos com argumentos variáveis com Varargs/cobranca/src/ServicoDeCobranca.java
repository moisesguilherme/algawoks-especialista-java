import java.util.Arrays;

public class ServicoDeCobranca {

    //Varargs
    // restricao usando o varargs, ele precisa ser o último parâmetro do seu método.
    // String... emailsCobranca
    void pagar(Fatura fatura, String... emailsCobranca) {
        System.out.println(Arrays.toString(emailsCobranca));
        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        for (String email : emailsCobranca) {
            System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
        }
    }

    void teste(int... numeros){
        System.out.println(Arrays.toString(numeros));
    }

}
