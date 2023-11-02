public class Principal {

    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();


        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem(
                "joao@algaworks.com", "maria@algaworks.com",
                "Olá, tudo bem?");

        //ServicoEmail.gerarAssinatura(); // ficou private
        servico.enviar(mensagem);

        Pessoa joao = new Pessoa();
        joao.idade = 30;
        joao.nome = "João";

        System.out.println(joao);
    }

    public static class Pessoa {
        int idade;
        String nome;

        @Override
        public String toString() {
            return "Pessoa{" +
                    "idade=" + idade +
                    ", nome='" + nome + '\'' +
                    '}';
        }
    }

}