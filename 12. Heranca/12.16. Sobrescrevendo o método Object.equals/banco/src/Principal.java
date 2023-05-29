import com.algaworks.banco.*;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial( new Titular("João da Silva", "12312312300"),
                1234, 999999,90);
        conta1.setLimiteChequeEspecial(1000);

        caixaEletronico.imprimirDemostrativo(conta1);

    }

}
