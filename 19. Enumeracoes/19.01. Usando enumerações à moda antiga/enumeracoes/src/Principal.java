public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        // Cancelar pedido
        //pedido.setStatus(StatusPedido.CANCELADO);
        pedido.cancelar();
        System.out.println(pedido.getStatus());

    }

}
