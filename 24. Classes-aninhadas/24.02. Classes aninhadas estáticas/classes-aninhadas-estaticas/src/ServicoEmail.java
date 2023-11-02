public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n", mensagem.getRemetente(), mensagem.getDestinatario(), mensagem.getTexto());
    }

    public static void testar(){
        System.out.println(">>> Método Estático Testar");
    }


    // Cola a classe Mensagem aqui
    public static class Mensagem {

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public static void testar(){
            System.out.println(">>> Método estático testar da classe Mensagem");
        }

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
            return texto;
        }

        public static class Mensagem2 {

            public static class Mensagem3 {
                public static void teste3(){
                    System.out.println(">>> Método estático testar da classe Mensagem 3");
                }
            }
        }

    }

}
