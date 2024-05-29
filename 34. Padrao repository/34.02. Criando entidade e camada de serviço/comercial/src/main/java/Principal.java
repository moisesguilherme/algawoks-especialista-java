import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        var cadastroVenda = new CadastroVenda();
        var vendaCadastrada = cadastroVenda.cadastrar("José da Silva",
                new BigDecimal("12300.87"), LocalDate.parse("2023-04-19"));

        System.out.println(vendaCadastrada);
    }

}
