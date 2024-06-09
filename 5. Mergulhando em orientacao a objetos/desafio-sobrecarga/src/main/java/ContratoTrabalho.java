public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    public ContratoTrabalho() {
    }

    public ContratoTrabalho(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    boolean temAdicional() {
        return funcionario.possuiFilhos();
    }


}
