import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);

        //Atribuindo o obejcto contaEspecial para conta...
        Conta conta = (Conta) contaEspecial; // upcasting explícito


        conta.imprimirDemonstrativo(); // O método qe está a ser chamado é da contaEspecial e não da Conta...
        System.out.println(conta.toString()); // O método qe está a ser chamado é da contaEspecial e não da Conta...

    }

}
