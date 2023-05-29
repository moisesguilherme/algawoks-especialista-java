import com.algaworks.banco.*;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial( new Titular("João da Silva", "12312312300"),
                1234, 999999,90);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial( new Titular("Maria", "98773733333"),
                2222, 888888,90);


        ContaSalario conta3 = new ContaSalario( new Titular("Francisco Souza", "44343434333"),
                2222, 888888,90);


        conta1.depositar(300);

        // Problema, se precisar da contaSalario para a conta especial.
        caixaEletronico.transferir(conta1, conta3, 50);

        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();

    }

}
