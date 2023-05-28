import com.algaworks.banco.*;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        // Não consegue fazer o casting, pq não está na hieraquia de classe
        //ContaInvestimento contaInvestimento = new ContaSalario(titular, 1234, 999999, 18_000);
        // Para conta já consegue.
        Conta contaInvestimento = new ContaSalario(titular, 1234, 999999, 18_000);



        System.out.println();

    }

}
