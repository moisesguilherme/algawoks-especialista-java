public class FolhaPagamento {


    public Holerite calcularSalario(ContratoTrabalho contratoTrabalho, int horasNormais, int horasExtras) {

        Holerite holerite = new Holerite(contratoTrabalho);
        holerite.valorTotalHorasNormais = contratoTrabalho.valorHoraNormal * horasNormais;
        holerite.valorTotalHorasExtras = contratoTrabalho.valorHoraExtra * horasExtras;

        double subTotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if(contratoTrabalho.temAdicional())
            holerite.valorAdicionalFilhos = subTotal * 0.1;

        return holerite;
    }

}
