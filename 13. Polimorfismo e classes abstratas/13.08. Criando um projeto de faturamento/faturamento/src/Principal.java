import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {

        var gestorFiscal = new GestorFiscal();

        // Não é desejado instanciar uma nota fiscal que não é concreta
        // ou nota fiscal tem q ser servico ou produto, notaFiscal é uma classe muito abstrato (genérico)
        var nf = new NotaFiscal("Abc", 500);

        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        gestorFiscal.emitirNotasFiscais(nf, nfBolaFutebol, nfReparoMotor);

        //System.out.println(nfBolaFutebol.calcularImpostos());
        //System.out.println(nfReparoMotor.calcularImpostos());


    }

}
