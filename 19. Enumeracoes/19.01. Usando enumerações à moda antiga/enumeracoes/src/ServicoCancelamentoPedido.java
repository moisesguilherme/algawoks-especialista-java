public class ServicoCancelamentoPedido {

    public void cancelar(Pedido pedido, boolean cliente) {
        pedido.cancelar();

        if (cliente) {
            System.out.println("Notificando gerente sobre cancelamento do pedido");
        }

    }

}
