public class Principal {

    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();

        Mensagem mensagem = new Mensagem(
                "joao@algaworks.com", "maria@algaworks.com",
                "Olá, tudo bem?");

        servico.enviar(mensagem);
    }

}