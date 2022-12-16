public class Principal {

    public static void main(String[] args) {
        var novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 1);

        var textoCompartilhado = Pessoa.COMPARTILHADO;
        Pessoa pessoa = new Pessoa();
        pessoa.imprimeTipoPessoa("Olá " + textoCompartilhado);

    }

}
