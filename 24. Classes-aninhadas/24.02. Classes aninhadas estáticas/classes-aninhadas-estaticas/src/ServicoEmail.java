public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n", mensagem.getRemetente(), mensagem.getDestinatario(), mensagem.getTexto());
    }

}
