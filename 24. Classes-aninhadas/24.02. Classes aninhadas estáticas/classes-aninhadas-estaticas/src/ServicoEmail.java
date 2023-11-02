// Vantagem da classes aninhadas, aumenta o encapsulamento.
// A classe acessa membros privados internos, membros protegidos
// A classe Mensagem foi criada para ser usada junto com ServicoEmail
public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n", mensagem.getRemetente(), mensagem.getDestinatario(), mensagem.getTexto());
        // Consegue acessar a variável de instâncias mesmo sendo private
        System.out.println(mensagem.remetente);
    }

    private static String gerarAssinatura(){
        return "\n--\nAlgaWorks";
    }


    // Cola a classe Mensagem aqui
    public static class Mensagem {

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getRemetente() {
            return remetente;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getTexto() {
            //ServicoEmail.gerarAssinatura();
            return texto + gerarAssinatura();
            // Consegue acessar mesmo se for private da super classe
        }

    }

}
