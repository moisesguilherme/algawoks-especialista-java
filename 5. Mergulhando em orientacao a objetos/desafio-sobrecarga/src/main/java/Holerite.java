public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    public Holerite(ContratoTrabalho contratoTrabalho) {
        this.funcionario = contratoTrabalho.funcionario;

    }

    public double calcularValorTotal() {

        double total = valorTotalHorasNormais + valorTotalHorasExtras;

        if(funcionario.possuiFilhos())
            valorAdicionalFilhos = total * 0.1;

        return total + valorAdicionalFilhos;
    }

    public void imprimir() {
        System.out.println("Funcionário: " + funcionario.nome +
                           "\nValor total das horas normais: " + valorTotalHorasNormais +
                           "\nValor total das horas extras: " +  valorTotalHorasExtras +
                           "\nValor do adicional para filhos: " + valorAdicionalFilhos +
                           "\nValor Total: " + calcularValorTotal()
        );

    }



}
