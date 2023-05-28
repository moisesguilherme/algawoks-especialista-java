import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999,90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        contaEspecial.debitarTarifaMensal();

        //upcasting
        //Conta conta = (Conta) contaEspecial;
        // na realiade tem os mesmos métodos da contaEspecial.

        //outra forma de fazer upcasting
        Conta conta = contaEspecial;

        ContaInvestimento contaInvestimento = (ContaInvestimento) contaEspecial;


        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());

        System.out.println(contaEspecial == conta);


    }

}
