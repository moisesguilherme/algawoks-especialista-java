public class FolhaPagamento {


    public Holerite calcularSalario(ContratoTrabalho contrato, int horasNormais, int horasExtras) {

        Holerite holerite = new Holerite(contrato.funcionario);
        holerite.valorTotalHorasNormais = contrato.valorHoraNormal * horasNormais;
        holerite.valorTotalHorasExtras = contrato.valorHoraExtra * horasExtras;
        holerite.calcularValorTotal();
        return holerite;
    }

}
