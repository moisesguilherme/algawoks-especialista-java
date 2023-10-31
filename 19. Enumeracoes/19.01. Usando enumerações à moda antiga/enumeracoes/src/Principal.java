public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(StatusPedido.EMITIDO);

        System.out.println(pedido.getTempoEntregaEmHoras());
        System.out.println("msg: " + pedido.getStatus().getMsg());
    }

}
