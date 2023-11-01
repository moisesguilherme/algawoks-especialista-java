public class ServicoCancelamentoPedido {

    public void cancelar(Pedido pedido, TipoUsuario tipoUsuario) {
        pedido.cancelar();

        //boolean value = tipoUsuario.equals(TipoUsuario.CLIENTE); //Chance de NPE (NullPointerException)
        boolean value = TipoUsuario.CLIENTE.equals(tipoUsuario); // Não ocorre o NPE

        if (value) {
            System.out.println("Notificando gerente sobre cancelamento do pedido");
        }

    }

}
