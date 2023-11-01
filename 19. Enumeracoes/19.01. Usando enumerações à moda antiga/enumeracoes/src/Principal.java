public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(100);
        //pedido.marcarComoEntregue();
        pedido.emitir();
        System.out.println("Status antes: " + pedido.getStatus());

        pedido.cancelar();
        System.out.println("Status depois: " + pedido.getStatus());

    }

}
