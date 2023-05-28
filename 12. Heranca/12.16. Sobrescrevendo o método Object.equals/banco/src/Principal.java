import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Titular titular2 = new Titular("Maria da Silva", "22312312300");
        Conta conta1 = new Conta(titular, 1234, 999999);
        Conta conta2 = new Conta(titular2, 1234, 999999);
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999,90);

        //System.out.println(conta1 == conta2); //false
        System.out.println(conta1.equals(conta2)); //true -> ver implementacão do equals
        System.out.println(conta1.equals(contaEspecial)); //false

    }

}
