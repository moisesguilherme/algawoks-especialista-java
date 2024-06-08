public class main {


    public static void main(String[] args) {

        Funcionario joao = new Funcionario();
        joao.nome = "João Silva";
        joao.quantidadeDeFilhos = 1;

        ContratoTrabalho tipoContrato = new ContratoTrabalho(joao);
        tipoContrato.valorHoraExtra = 100;
        tipoContrato.valorHoraNormal = 100;

        FolhaPagamento folha = new FolhaPagamento();
        Holerite holerite = folha.calcularSalario(tipoContrato, 5, 1);
        holerite.imprimir();

    }




}
