import com.algaworks.locadora.*;

public class Principal {

    public static void main(String[] args) {

        Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);

        // Vai compondo na implementacão.
        Precificacao precificacao = new PrecificacaoPorHora();
        //Precificacao precificacao = new PrecificacaoPorDia();

        //Seguro seguro = new SeguroSantander();
        Seguro seguro = new SeguroItau();

        Locacao locacao = new Locacao(notebook, precificacao, seguro);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }

}