public class Principal {

    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();

        ServicoEmail.testar();

        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem(
                "joao@algaworks.com", "maria@algaworks.com",
                "Olá, tudo bem?");

        servico.enviar(mensagem);
        ServicoEmail.Mensagem.testar();
        ServicoEmail.Mensagem.Mensagem2.Mensagem3.teste3();
    }

}