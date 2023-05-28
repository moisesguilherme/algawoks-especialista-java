import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Conta conta1 = new Conta(titular, 1234, 999999);
        Conta conta2 = new Conta(titular, 1234, 999999);
        Conta conta3 = new Conta(titular, 1234, 999999);
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999,90);



        //Simétrico
        //System.out.println(conta1.equals(conta2));
        //System.out.println(conta2.equals(conta1));

        //Transitivo
        System.out.println(conta1.equals(conta2));
        System.out.println(conta2.equals(conta3));
        //A conta 1 tb tem q ser igual a conta 3
        System.out.println(conta1.equals(conta3));

        //Consistente.
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta2));

        //Uma referência não nula comparada com null sempre deve retornar false
        System.out.println(conta1.equals(null));

    }

}
